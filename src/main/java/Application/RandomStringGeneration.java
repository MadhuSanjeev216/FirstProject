package Application;

public class RandomStringGeneration {


    public String randomString(int sizeOfString){

        String alphaNumericString = "mnbvcxzasdfghjklpoiuytrewq"+"QWERRTYUIOPLKJHGFDSAZXCVBNM"+"0123456789";
        StringBuilder unique = new StringBuilder();

        for(int i=0;i<=sizeOfString; i++){
            //System.out.print(((int)alphaNumericString.length()*Math.random()));
           // System.out.println(Math.random());
                int index =(int)(alphaNumericString.length()*Math.random());
            System.out.println(index);
                  unique.append(alphaNumericString.charAt(index));
        }
        return unique.toString();
    }

    public static void main(String[] args) {
        RandomStringGeneration robj = new RandomStringGeneration();
        System.out.println(robj.randomString(23));
    }
}
