class Booking{
    int bookingId,customerId,pickUpTime,dropTime,amount;
    char from,to;


    public Booking(){
        super();
    }
    
    public Booking(int bookingId,int customerId,char from,char to,int pickUpTime,int dropTime,int amount){
        super();
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pickUpTime = pickUpTime;
        this.dropTime = dropTime;
        this.amount = amount;
    }
}