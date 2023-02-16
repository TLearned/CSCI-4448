import java.util.ArrayList;
import java.util. Collections;
import java.util.Random;

class Buyer{
    String CarPref;
    String buyType;
    public Buyer(){
        int where =new Random().nextInt(2);
        int type =new Random().nextInt(2);
        if(where==0){
            this.buyType = "Just Looking";

        }else if (where==1){
            this.buyType = "Wants One";

        }
        else{
            this.buyType = "Needs One";
        }
        if(type==0){
            this.CarPref = "Car";

        }else if (type==1){
            this.CarPref = "Pickup";

        }
        else{
            this.CarPref= "Performance Car";
        }
    }

}



class Shop{
    ArrayList<Intern>internNum;
    ArrayList<Mechanic>mechNum;
    ArrayList<Saleman>salesNum;
    ArrayList<Cars>carNum;
    int numOfSales;
    double operatingBud;
 public Shop(){
     this.operatingBud = 500000;
    this.numOfSales=0;
    this.internNum =new ArrayList<Intern>();
    this.carNum = new ArrayList<Car>();
    this.mechNum = new ArrayList<Mechanic>();
    this.salesNum = new ArrayList<Saleman>();
 }

}

class Day{
    int whichDay;
    public Day() {
            this.whichDay=1;
    }

        void Opening(Shop shop){
            System.out.println("Opening Balance:"+shop.operatingBud);
            if(shop.internNum.size()<3){


            }
            if(shop.carNum.size()<3){


            }
            if(shop.mechNum.size()<3){


            }
            if(shop.carNum.size()<12){
                int pickup =0;
                int car =0;
                int Pcar =0;
                for(int i = 0; i<shop.carNum.size();i++){




                }
                if(pickup<4){

                }
                else if (car<0){

                }else{


                }

            }
        }
        void Closing(Shop shop){
                int mecLeave = new Random().nextInt(10);
                int InterLeave = new Random().nextInt(10);
                int SaleLeave = new Random().nextInt(10);
                if(mecLeave==5){

                }
                if(InterLeave==5){

                }
                if(SaleLeave==5){

                }
        }

        void EntireDay(Shop shop){
            while(whichDay!=0) {


                if (whichDay % 7 != 0) {


                }
                whichDay+=1;
            }
        }


}
