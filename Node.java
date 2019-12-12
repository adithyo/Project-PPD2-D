
public class Node {

    private String roomno;
    private String roomtype;
    private String roomrate;
    private String bedtype;

    public Node() {
        roomno = "";
        roomtype = "";
        roomrate = "";
        bedtype = "";
    }

    public Node(String roomno, String roomtype, String roomrate, String bedtype) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomrate = roomrate;
        this.bedtype = bedtype;
    }

    public String getNo() {
        return roomno;
    }

    public String getType() {
        return roomtype;
    }

    public String getRate() {
        return roomrate;
    }

    public String getBed() {
        return bedtype;
    }

    public void setNo(String roomno) {
        this.roomno = roomno;
    }

    public void setType(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setRate(String roomrate) {
        this.roomrate = roomrate;
    }

    public void setBed(String bedtype) {
        this.bedtype = bedtype;
    }

    @Override
    public String toString() {
        return roomno + "\t" + roomtype + "\t" + roomrate + "\t" + bedtype;
    }
}
