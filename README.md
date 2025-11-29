# Ticket Booking Application (CLI Based)

A command-line Java application for booking, viewing, and cancelling tickets for events. This simple ticket management system helps users interact through the terminal with a focus on usability and clarity.

## Features

- **Book Tickets:** Reserve tickets for available events via CLI.
- **View Bookings:** Display all your bookings and ticket details.
- **Cancel Tickets:** Cancel an existing booking with ease.
- **Show Event Schedule:** Display a list of upcoming events.
- **Simple CLI Navigation:** Easy, step-by-step prompts for all actions.

## Technologies Used

- **Java**  
- No external libraries required (unless specified in your project)

## Getting Started

### Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) 8 or higher
- Git (for cloning the repository)

### Download & Setup

1. **Clone the repository**
   ```sh
   git clone https://github.com/Rajdeep-git776/Ticket-Booking-Application---CLI-Based.git
   cd Ticket-Booking-Application---CLI-Based
   ```

2. **Compile the Java source files**

   If your main class is named `TicketBookingApp.java` (update with correct file/class name if different):

   ```sh
   javac TicketBookingApp.java
   ```

   Or, if using packages or multiple files:
   ```sh
   javac *.java
   ```

3. **Run the application**

   ```sh
   java TicketBookingApp
   ```
   *(Update the main class name if needed)*

### Example CLI Usage

```text
====== Ticket Booking System ======
1. Book a Ticket
2. View Bookings
3. Cancel a Ticket
4. View Event Schedule
5. Exit

Enter your choice: _
```

## Project Structure

```
Ticket-Booking-Application---CLI-Based/
├── TicketBookingApp.java      # Main Java class
├── Event.java                 # Event model/class
├── Booking.java               # Booking model/class
├── README.md                  # Project documentation
└── ...                        # Other supporting files
```

*Edit class/file names as per your codebase structure.*

## Contributing

Contributions and suggestions for improvements are welcome!

- Fork the repository
- Create your feature branch (`git checkout -b feature/NewFeature`)
- Commit your changes (`git commit -am 'Add new feature'`)
- Push to the branch (`git push origin feature/NewFeature`)
- Open a pull request

## License

Distributed under the MIT License. See `LICENSE` for details.

## Author

**Rajdeep-git776**  
[GitHub](https://github.com/Rajdeep-git776)

---

*Found a bug or have a feature request? Open an issue in the repository!*
