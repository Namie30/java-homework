package ge.tbc.testautomation.annotationsAndStreams;

public class Analyzable {
    /*@VariableNameAnnotation(name = "StringVariable")
    private String strVar; */

    @VariableNameAnnotation(name = "strVar")
    private String strVar;

    @VariableNameAnnotation(name = "IntegerVariable")
    private int intVar;

    @VariableNameAnnotation(name = "BooleanVariable")
    private boolean boolVar;

    @VariableNameAnnotation(name = "CustomVariableName")
    private double customVar;

    @VariableNameAnnotation // Default value
    private String defaultNameVar;

    @VariableNameAnnotation(name = "OtherVariable")
    private long otherVar;

    @VariableNameAnnotation(name = "CharVariable")
    private char charVar;

    @VariableNameAnnotation(name = "DoubleVariable")
    private double doubleVar;

    @VariableNameAnnotation(name = "DifferentName")
    private float differentNameVar;

}




