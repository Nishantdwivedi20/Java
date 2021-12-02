class AddAmount {
    int Amt=50;
    
     AddAmount(){
         System.out.println(Amt);
    }
    AddAmount(int Amt1){
         Amt=Amt+Amt1;
        System.out.println(Amt);
    }
}
class test8{
    public static void main(String[] args) {
        AddAmount obj = new AddAmount(50);
    }
}
