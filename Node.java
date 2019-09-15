package TestTree;

/**
 * @ClassName Node
 * @Description TODO
 * @Auther danni
 * @Date 2019/9/14 14:41]
 * @Version 1.0
 **/

public class Node {
    private char val;
     Node left;
     Node right;

    public Node(char val){
        this.val=val;
    }

    public Node(){

    }
    public String toString(){
        return String.format("[%s]",val);
    }
    public void setVal(char val) {
        this.val = val;
    }

    public char getVal() {
        return val;
    }


}
