package Assignment2_000791775;


/**
 * This is where the ticket machine variables and methods are held
 * @ author: Ohia William Kenechukwu 000791775
 */
public class TicketMachine {  // class for the ticket machine which will hold the variables and methods
    String route1;
    String route2;
    String currentRoute = " ";
    int numAdult = 0;
    int numChild = 0;
    double credit = 0;
    double price;

    public void addAdult() {this.numAdult++;}
    public void removeAdult() {this.numAdult--;}
    public void addChild() {this.numChild++;}
    public void removeChild() {this.numChild--;}
    public void addloonie() {this.credit++;}
    public void addToonie() {this.credit = credit + 2;}
    public void addQuarter() {this.credit = credit + 0.25;}

    // method for checking whether the machine will print a ticket or not. This is done
    // by checking if price is greater or lesser than the credit
    public String PrintTicket() {
        this.price = (this.numAdult*5) + (this.numChild*2.50);
        if (price > credit){
            return "Not enough credit!!";

        } else {
            numChild = 0;
            numAdult = 0;
            credit = 0;
            System.out.println("----------------------------------");
            return "YOU GOT YOUR TICKET";
        }
    }
    // method for printing the string
    public String toString(){
        return "\n" + "----------------------------------------------------------\n"
                + "Selected Route: " + this.currentRoute + " child: $2.50      Adult: $5.00\n"
                + "Children: " + this.numChild + " Adults: " + this.numAdult + "\n" +
                "Credit: $ " + credit + "\n" + "--------------------------------------------------";

    }
}

