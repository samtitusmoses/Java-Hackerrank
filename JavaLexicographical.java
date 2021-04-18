import java.util.Scanner;

class SubstringLexicographical {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int n=s.length();
        String str[]=new String[n-k+1];
        for(int i=0;i<n-k+1;i++){
            str[i]=s.substring(i,i+k);
        }
        for(int i=0;i<n-k;i++){
            for(int j=i+1;j<n-k+1;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        smallest=str[0];
        largest=str[n-k];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}