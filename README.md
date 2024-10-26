# Ticket-Booking-System
Java OOP based ticket Booking System

## Features

- **Check Seat Availability**: The system reads from `Seats.txt` and displays available and booked seats to the user.
- **Book Seats**: Users can book desired seats, which updates the seat information in `Seats.txt`.
- **View Booking Status**: The system provides a summary of the number of seats booked and whether a specific seat is booked or available.

## Project Structure

The project contains the following core Java classes:

1. **Avail.java**  
   - Responsible for checking available seats.  
   - Reads seat availability from `Seats.txt`, where `0` indicates an available seat, and `1` indicates a booked seat.  
   - Displays the availability status to the user.

2. **Book.java**  
   - Handles seat booking for the user.  
   - Prompts the user to select a seat and updates the `Seats.txt` file with the new booking information.

3. **Check.java**  
   - Provides a report of the total number of seats booked.  
   - Allows users to check whether a specific seat is booked or available.

## How It Works

1. **Seats.txt Format**:  
   The `Seats.txt` file stores seat availability using `0` for available seats and `1` for booked seats.  
   Example content of `Seats.txt`:  

2. **Checking Availability**:
- Run `Avail.java` to view which seats are available.
- Seats marked as `0` are available for booking.

3. **Booking Seats**:
- Run `Book.java` to book a seat.
- The system will prompt for a seat number and update the corresponding seat in `Seats.txt` from `0` to `1`.

4. **Viewing Booking Status**:
- Run `Check.java` to view the total number of booked seats or check the status of a specific seat.
