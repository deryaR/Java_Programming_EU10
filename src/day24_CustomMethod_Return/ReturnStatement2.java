package day24_CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {

        nameOfMonth(10);

    }



    //3. Create a method that can display the name of the month based on the given number to the method
    //3. Yönteme verilen sayıya göre ayın adını görüntüleyebilen bir yöntem oluşturun

    public static void nameOfMonth (int number){
        if (number < 1 || number > 12){
            System.out.println("Invalid");
            return; // exits nameOfMonth method, remaining code fragments of the method never gets executed
                    // nameOfMonth yönteminden çıkar, yöntemin kalan kod parçaları hiçbir zaman yürütülmez

        }



    String name =  (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
            :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
            :(number==11)?"Nov" : "Dec";

         System.out.println("Month name = " + name);

}

}
