ArrayList<Integer> processInput(char[] in, int startPoint, int inSize){
    ArrayList<Integer> array = new ArrayList<>();
    Integer temp = new Integer(0);
    for(int i=startPoint;i<inSize;i++){
        if(in[i]==']'){
            array.add(temp);
            break;
        }
        if(i==inSize-1){
            temp*=10;
            temp+=in[i]-'0';
            array.add(temp);
            break;
        }
        if(in[i]==','){
            array.add(temp);
            temp = 0;
            i++;
            continue;
        }
        temp*=10;
        temp+=in[i]-'0';
    }
    return array;
}

int sum=0;
int maxInt=0;
public void processArray(ArrayList<Integer> array){
    for(int i:array){
        sum+=i;
        if(i>maxInt){
            maxInt=i;
        }
    }
}

public int findMinCapacity(ArrayList<Integer> weights, Integer days, int leftEnd, int rightEnd){
    if(leftEnd==rightEnd){
        return leftEnd;
    }
    int tempSum=0;
    int dayCount=1;
    int middle=(leftEnd+rightEnd)/2;

    for(int i:weights){
        if(tempSum+i>middle){
            dayCount+=1;
            tempSum=0;
        }
        tempSum+=i;
        if(dayCount>days){
            leftEnd=middle+1;
        }
    }
    if(leftEnd!=middle+1){
        rightEnd=middle;
    }
    return(findMinCapacity(weights, days, leftEnd, rightEnd));
}

void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input1 = scanner.nextLine();
    String input2 = scanner.nextLine();
    ArrayList<Integer> weights = processInput(input1.toCharArray(), 11, input1.length());
    Integer days = processInput((input2+"]").toCharArray(), 7, input2.length()).get(0);
    processArray(weights);
    System.out.println(findMinCapacity(weights, days, maxInt, sum));
}