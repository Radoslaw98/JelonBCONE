package ProjectHouse;

public class Window {

    private boolean isOpen;

    public Window() {
        this.isOpen = false;
    }


    public void openWindow() {
        isOpen = true;
        System.out.println("Otwarte");
    }


    public void closedWindow() {
        isOpen = false;
        System.out.println("Zamkniete");
    }

    @Override
    public String toString() {
        return "Okno{" +
                "isOpen=" + isOpen +
                '}';
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
