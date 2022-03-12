package frc.swerverobot;

//Shooter Subsystem - Color Sensor
import edu.wpi.first.wpilibj.I2C;

public class Constants {
    public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 0;
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 1;
    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 2;
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 3;

    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 4;
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 5;
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 6;
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 7;

    public static final int DRIVETRAIN_FRONT_LEFT_ENCODER_PORT = 0;
    public static final int DRIVETRAIN_FRONT_RIGHT_ENCODER_PORT = 1;
    public static final int DRIVETRAIN_BACK_LEFT_ENCODER_PORT = 2;
    public static final int DRIVETRAIN_BACK_RIGHT_ENCODER_PORT = 3;

    public static final double DRIVETRAIN_FRONT_LEFT_ENCODER_OFFSET = -Math.toRadians(337.95);
    public static final double DRIVETRAIN_FRONT_RIGHT_ENCODER_OFFSET = -Math.toRadians(338.03);
    public static final double DRIVETRAIN_BACK_LEFT_ENCODER_OFFSET = -Math.toRadians(338.65);
    public static final double DRIVETRAIN_BACK_RIGHT_ENCODER_OFFSET = -Math.toRadians(338.21);

    public static final int SHOOTER_DRIVE_MOTOR_PORT_1 = 15;
    public static final int SHOOTER_DRIVE_MOTOR_PORT_2 = 16;

    public static final int SHOOTER_ANGLE_MOTOR_PORT = 17;
    public static final double SHOOTER_HOOD_MIN_ANGLE  = 0;
    public static final double SHOOTER_HOOD_MAX_ANGLE = 0;
    public static final double SHOOTER_HOOD_OFFSET = 0;
    public static final double SHOOTER_HOOD_GEAR_RATIO = 0;

    public static final double WHEEL_OF_FORTUNE_RED_HUE = 45;
    public static final double WHEEL_OF_FORTUNE_GREEN_HUE = 130;
    public static final double WHEEL_OF_FORTUNE_BLUE_HUE = 170;
    public static final double WHEEL_OF_FORTUNE_YELLOW_HUE = 90;

   
    public static final int INTAKE_EXTENSION_SOLENOID = 5;

    public static final int PRIMARY_CONTROLLER_PORT = 0;
    public static final int SECONDARY_CONTROLLER_PORT = 1;

    public static final int FEEDER_MOTOR_PORT = 18;

    public static final int WHEEL_OF_FORTUNE_MOTOR_PORT = 5;

    public static final int WHEEL_OF_FORTUNE_DEPLOY_SOLENOID_PORT = 2;

    public static final int CLIMBER_DEPLOY_SOLENOID_PORT = 21;
    public static final int CLIMBER_EXTEND_SOLENOID_1_PORT = 26;
    public static final int CLIMBER_EXTEND_SOLENOID_2_PORT = 27;

    public static final int FEEDER_IS_FULL_SENSOR_PORT = 0;
    public static final int FEEDER_INTAKE_BALL_SENSOR_PORT = 1;


    public static final int INTAKE_MOTOR = 11;
    public static final int INDEX_MOTOR = 12;
    public static final int SHOOTER_MOTOR = 15;
    public static final int FEEDER_MOTOR = 14;

    public static final int INTAKE_EXTENSION_SOLENOID_FORWARD = 0;
    public static final int INTAKE_EXTENSION_SOLENOID_REVERSE = 1;

    //public static final int SERVO_MOTOR = 6;
    //public static final int CLIMBER_MOTOR = 8;
}