
public class demo2{
    private String cardId;
    private Integer limit;
    public String owerName;
    public void setcardInformation(String cardId,String ownerName,Integer limit){
        this.cardId=cardId;
        this.owerName=ownerName;
        this.limit=limit;
    }
    public static void main(String[] args) {
     
        demo2 d=new demo2();
        d.setcardInformation("cardId", "wnerName",101);
        //System.out.println(f[0]);
    }
}
