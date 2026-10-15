package org.firstinspires.ftc.teamcode;

import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextTeleop;

@NextTeleop
public class DriveTest extends NextOpMode {
    private final TestRobot robot;

    public DriveTest(TestRobot robot) {
        super(robot);
        this.robot = robot;
    }

    @Override
    public void start() {
        robot.drivetrain.startDrive(gamepad1);
    }
}
