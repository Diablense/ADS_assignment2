public String sortString(String str1){
    char[] str = str1.toCharArray();
    int strSize=str1.length();
    char temp = 'a';
    for(int i = 0; i<strSize; i++){
        for(int j = i+1; j<strSize;j++){
            if(str[i]>str[j]){
                temp = str[j];
                str[j]=str[i];
                str[i]=temp;
            }
        }
    }
    str1 = new String(str);
    return str1;
}
void main() {
    Scanner scanner = new Scanner(System.in);
    String input1 = scanner.nextLine();
    String input2 = scanner.nextLine();
    input1 = sortString(input1);
    input2 = sortString(input2);
    if(input1.equals(input2)){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
}