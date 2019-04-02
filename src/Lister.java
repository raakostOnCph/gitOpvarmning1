public class Lister {

    Knude head;
    Knude tail;


    public boolean Empty() {

        return (head == null && tail == null);

    }


    public boolean OnlyOne() {

        return tail == head;
    }


    public Knude removeFromTail() {

        Knude knude = null;

        if (Empty()) {
            return knude;
        }
        if (OnlyOne()) {
            knude = head;
            head= null;
            tail=null;
            return knude;
        }
        knude = tail;
        tail = tail.previous;
        tail.next.previous = null;
        tail.next = null;
        return knude;


    }
}