package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous
public class testFTC extends OpMode {

    public void init() {
        telemetry.addData("Hello", "World");
    }

    public void loop() {
        telemetry.addData("Hello", "Cata");
    }
}
