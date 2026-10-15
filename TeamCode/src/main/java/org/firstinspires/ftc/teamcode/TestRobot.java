package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.mechanisms.Drivetrain;

import java.util.Set;

import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.NextRobot;

public class TestRobot implements NextRobot {
    Drivetrain drivetrain = new Drivetrain();
    @Override
    public Set<Mechanism> getMechanisms() {
        return Set.of(drivetrain);
    }
}
