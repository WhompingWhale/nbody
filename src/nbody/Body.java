package nbody;

public class Body {
    private BPoint point;
    private double mass;
    private String name;
    private BVector vector;
    
    public double getX(){
        return point.getX();
    }
    public void setX(double inputX){
        point.setX(inputX);
    }
    public double getY(){
        return point.getY();
    }
    public void setY(double inputY){
        point.setY(inputY);
    }
    public double getMass(){
        return mass;
    }
    public void setMass(double inputMass){
        mass = inputMass;
    }
    public String getName(){
        return name;
    }
    public void setName(String inputName){
        name = inputName;
    }
    public BPoint getBPoint(){
        return point;
    }
    public void setBPoint(BPoint inputBPoint){
        point = inputBPoint;
    }
    public void addBPoint(BPoint inputBPoint){
        point.addBPoint(inputBPoint);
    }
    public BVector getBVector(){
        return vector;
    }
    public void setBVector(BVector inputBVector){
        vector = inputBVector;
    }
    public void addBVector(BVector inputBVector){
        vector.addBVector(inputBVector);
    }
    
    public void setXY(double inputX, double inputY){
        setX(inputX);
        setY(inputY);
    }
    public void addXY(double inputX, double inputY){
        setXY(getX() + inputX, getY() + inputY);
    }
    public double getDistanceXTo(Body inputBody){
        return getX() - inputBody.getX();
    }
    public double getDistanceYTo(Body inputBody){
        return getY() - inputBody.getY();
    }
    public double getDistanceTo(Body inputBody){
        return Math.sqrt(Math.pow(getDistanceXTo(inputBody),2) + Math.pow(getDistanceYTo(inputBody),2));
    }
    public double getDirTo(Body inputBody){
        return Math.atan2(getDistanceYTo(inputBody), getDistanceXTo(inputBody));
    }
    public Body(double inputX, double inputY, double inputMass, String inputName, double inputDir, double inputSpeed){
        BPoint inputBPoint = new BPoint(inputX, inputY);
        setBPoint(inputBPoint);
        setMass(inputMass);
        setName(inputName);
        BVector inputBVector = new BVector(inputDir, inputSpeed);
        setBVector(inputBVector);
    }
}
