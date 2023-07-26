public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void showImmutablePoint(){
        int point = x*y;
        System.out.println(point);
    }
}
