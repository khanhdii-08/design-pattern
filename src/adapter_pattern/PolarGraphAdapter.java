package adapter_pattern;

public class PolarGraphAdapter implements IGraph{

    private final PolarGraph polarGraph;

    public PolarGraphAdapter(PolarGraph polarGraph) {
        this.polarGraph = polarGraph;
    }

    @Override
    public void Point(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        double t = Math.atan2(y, x);
        polarGraph.Point(r, t);
    }
}
