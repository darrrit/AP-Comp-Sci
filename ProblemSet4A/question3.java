public class question3 {
    public static void main(String[] args) {
        StdDraw.setScale(0, 1);
        OrderedPair topLeft = new OrderedPair(0, 1);
        OrderedPair topRight = new OrderedPair(1, 1);
        OrderedPair bttm = new OrderedPair(0.5, 1);
        StdDraw.point(bttm.X, bttm.Y);
        StdDraw.point(topLeft.X, topLeft.Y);
        StdDraw.point(topRight.X, topLeft.Y);
        OrderedPair rndm = new OrderedPair(Math.random(), Math.random());
        for (int i = 0; i <10000; i++) {
            int rnm = (int) Math.random()*3;
            if (rnm == 1) {
            rndm.X = (rndm.X + topLeft.X / 2);
            rndm.Y = (rndm.Y + topLeft.Y / 2);
            } else if (rnm ==2) {
            rndm.X = (rndm.X + topRight.X / 2);
            rndm.Y = (rndm.Y + topRight.Y / 2);
            } else {
            
            }
            rndm
        }
    }
}