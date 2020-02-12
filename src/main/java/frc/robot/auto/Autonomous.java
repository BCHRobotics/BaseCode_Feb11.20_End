/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class Autonomous {

    private static final String kDefaultAuto = "Default";

    private static final String kstart1shootHendRend = "Start 1, Shoot High, End Rendez-vous";
    private static final String kstart1shootHendTrench = "Start 1, Shoot High, End Trench";
    private static final String kstart1shootHendHome = "Start 1, Shoot High, End Home";
    private static final String kstart1shootLendRend = "Start 1, Shoot Low, End Rendez-vous";
    private static final String kstart1shootLendTrench = "Start 1, Shoot Low, End Trench";
    private static final String kstart1shootLendHome = "Start 1, Shoot Low, End Home";

    private static final String kstart2shootHendRend = "Start 2, Shoot High, End Rendez-vous";
    private static final String kstart2shootHendTrench = "Start 2, Shoot High, End Trench";
    private static final String kstart2shootHendHome = "Start 2, Shoot High, End Home";
    private static final String kstart2shootLendRend = "Start 2, Shoot Low, End Rendez-vous";
    private static final String kstart2shootLendTrench = "Start 2, Shoot Low, End Trench";
    private static final String kstart2shootLendHome = "Start 2, Shoot Low, End Home";

    private static final String kstart3shootHendRend = "Start 3, Shoot High, End Rendez-vous";
    private static final String kstart3shootHendTrench = "Start 3, Shoot High, End Trench";
    private static final String kstart3shootHendHome = "Start 3, Shoot High, End Home";
    private static final String kstart3shootLendRend = "Start 3, Shoot Low, End Rendez-vous";
    private static final String kstart3shootLendTrench = "Start 3, Shoot Low, End Trench";
    private static final String kstart3shootLendHome = "Start 3, Shoot Low, End Home";

    private String m_autoSelected;
    private final SendableChooser<String> m_chooser = new SendableChooser<>();

    public Autonomous(){
        m_chooser.setDefaultOption("Default Auto", kDefaultAuto);

        m_chooser.addOption("Start 1, Shoot High, End Rendez-vous", kstart1shootHendRend);
        m_chooser.addOption("Start 1, Shoot High, End Trench", kstart1shootHendTrench);
        m_chooser.addOption("Start 1, Shoot High, End Home", kstart1shootHendHome);
        m_chooser.addOption("Start 1, Shoot Low, End Rendez-vous", kstart1shootLendRend);
        m_chooser.addOption("Start 1, Shoot Low, End Trench", kstart1shootLendTrench);
        m_chooser.addOption("Start 1, Shoot Low, End Home", kstart1shootLendHome);

        m_chooser.addOption("Start 2, Shoot High, End Rendez-vous", kstart2shootHendRend);
        m_chooser.addOption("Start 2, Shoot High, End Trench", kstart2shootHendTrench);
        m_chooser.addOption("Start 2, Shoot High, End Home", kstart2shootHendHome);
        m_chooser.addOption("Start 2, Shoot Low, End Rendez-vous", kstart2shootLendRend);
        m_chooser.addOption("Start 2, Shoot Low, End Trench", kstart2shootLendTrench);
        m_chooser.addOption("Start 2, Shoot Low, End Home", kstart2shootLendHome);

        m_chooser.addOption("Start 3, Shoot High, End Rendez-vous", kstart3shootHendRend);
        m_chooser.addOption("Start 3, Shoot High, End Trench", kstart3shootHendTrench);
        m_chooser.addOption("Start 3, Shoot High, End Home", kstart3shootHendHome);
        m_chooser.addOption("Start 3, Shoot Low, End Rendez-vous", kstart3shootLendRend);
        m_chooser.addOption("Start 3, Shoot Low, End Trench", kstart3shootLendTrench);
        m_chooser.addOption("Start 3, Shoot Low, End Home",kstart3shootLendHome);

        SmartDashboard.putData("Auto choices", m_chooser);
        SmartDashboard.putNumber("gyro", -1);
    }

    public void init(){
        m_autoSelected = m_chooser.getSelected();
        // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
        System.out.println("Auto selected: " + m_autoSelected);
    }

    public void periodic(){
        switch (m_autoSelected) {
            case kstart1shootHendRend:

                break;
            case kstart1shootHendTrench:

                break;
            case  kstart1shootHendHome:

                break;
            case  kstart1shootLendRend:

                break;
            case kstart1shootLendTrench:

                break;
            case kstart1shootLendHome:

                break;
            case kstart2shootHendRend:
                
                break;
            case kstart2shootHendTrench:

                break;
            case kstart2shootHendHome:

                break;
            case kstart2shootLendRend:

                break;
            case kstart2shootLendTrench:

                break;
            case kstart2shootLendHome:

                break;
            case kstart3shootHendRend:

                break;
            case kstart3shootHendTrench:

                break;
            case kstart3shootHendHome:

                break;
            case kstart3shootLendRend:

                break;
            case kstart3shootLendTrench:

                break;
            case kstart3shootLendHome:

                break;
            case kDefaultAuto:
            default:
                // Put default auto code here
                break;
          }
    }

}
