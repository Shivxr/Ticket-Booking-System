public class Check {

    public int check(int flag) throws Exception{

        if(flag>0){
            System.out.println("Tickets were Booked Succesfully");
            System.out.println("The amount of Tickets Booked are : "+flag);
        }
        else{
            System.out.println("No Tickets were Booked");
        }
        return 0;
    }
}
