package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {

        Math math = new Math();
        math.getResult();
    }
}
class Math{
    private int i=10;


   public void  getResult(){

       int delimoe=21;

      // delimoe = 21;
       class Delenie{




//           private int delimoe;
           private int deliteli;

           public int getDelimoe() {
               return delimoe;
           }

//           public void setDelimoe(int delimoe) {
//               this.delimoe = delimoe;
//           }

           public int getDeliteli() {
               return deliteli;
           }

           public void setDeliteli(int deliteli) {
               this.deliteli = deliteli;
           }

           public int getChastnoe(){
               return delimoe/deliteli;
           }

           public int getOstatok(){
               return delimoe%deliteli;
           }
       }

       Delenie delenie = new Delenie();
//       delenie.setDelimoe(21);
       delenie.setDeliteli(4);
       System.out.println("Delimoe = "+delimoe);
       System.out.println("Deliteli = "+delenie.getDeliteli());
       System.out.println("Chiastnoe = "+delenie.getChastnoe());
       System.out.println("Ostatok = "+delenie.getOstatok());
       System.out.println("permenaia i = "+i);


   }
}