package ticket.booking.services;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.Train;
import ticket.booking.entities.User;
import ticket.booking.utils.UserServiceUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserBookingService {

    private User user;
    private List<User> userList;

    private final String USER_PATH = System.getProperty("user.dir") + "/ticket/booking/localDb/users.json";
    private static ObjectMapper objectMapper = new ObjectMapper();

    public UserBookingService() throws IOException {
            loadUsers();

    }


    public UserBookingService(User user) throws IOException {
        this.user = user;
        loadUsers();
    }

    private List<User> loadUsers() throws IOException {
        File users = new File(USER_PATH);
        return objectMapper.readValue(users, new TypeReference<List<User>>(){});

    }


    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equalsIgnoreCase(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile() throws IOException {
        File userFile = new File(USER_PATH);
        objectMapper.writeValue(userFile,userList);
    }

    public void fetchBooking(){
        user.printTickets();
    }

    public Boolean cancelBooking(String ticketId){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ticket id to cancel.");
        ticketId=s.next();
        if(ticketId==null || ticketId.isEmpty()){
            System.out.println("Ticket ID cannot be null or empty.");
            return Boolean.FALSE;
        }

        String finalTicketId1 = ticketId;
       boolean removed = user.getTicketsBooked().removeIf(ticket -> ticket.getTicketId().equals(finalTicketId1));
        if(removed){
            System.out.println("Ticket with ID " + ticketId + " has been canceled.");
            return Boolean.TRUE;
        }else{
        System.out.println("No ticket found with ID " + ticketId);
        return Boolean.FALSE;
    }



    }


    public List<Train> getTrains(String source, String destination){
        try{
            TrainService trainService = new TrainService();
            return trainService.searchTrain(source,destination);
        }catch(IOException ex){
            return new ArrayList<>();
        }
    }
}
