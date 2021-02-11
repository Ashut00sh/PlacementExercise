class sup{
     public int cal(int a,int b){
         System.out.println("inside super class");
        return 0;
    }
}
class sub extends sup{
    public int cal(int a,int b){
        System.out.println("in sub class");
        return 1;
    }
}
class pq1{
    public static void main(String[] args) {
        sup get=new sub();
        System.out.println("x= "+get.cal(0, 1));
    }
}