public class Hasmap_5element_after_space{
    public static void main(String[] args) {
        String str = "avinash  snjssanfsa nfaefna";
        System.out.println(str);
        String noSpaceStr = str.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(noSpaceStr);
        StringBuilder result = new StringBuilder();
        int temp=0;
        for (int i = 6; i <sb.length(); i=i+5)
        {
            result=result.append(sb.substring(temp,i)+" ");
            temp=i;
        }
        if(sb.length()%5!=0){
            result=result.append(sb.substring(temp,sb.length())+" ");
        }
        System.out.println(result.toString());
    }
}
