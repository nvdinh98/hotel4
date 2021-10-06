package Model;

import Controller.RoomManager;
import Controller.UserManager;

import java.time.LocalDate;

public class Invoice {
    private LocalDate checkin;
    private LocalDate checkout;
    private User userId;
    private Room roomId;

    public Invoice() {
    }

    public Invoice(LocalDate checkin, LocalDate checkout, User userId, Room roomId) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.userId = userId;
        this.roomId = roomId;
    }

    public Invoice(LocalDate of, LocalDate of1, UserManager userManager, RoomManager roomManager) {

    }

    public Invoice(LocalDate now, LocalDate now1, String s, String s1) {
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Room getRoomId() {
        return roomId;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "checkin=" + checkin +
                ", checkout=" + checkout +
                ", userId=" + userId +
                ", roomId=" + roomId +
                '}';
    }
}
