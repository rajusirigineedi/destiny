package com.mini14.destiny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mini14.destiny.adaprers.SelectTopicRecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectTopicsActivity extends AppCompatActivity {

    String[] selectTopicsArray = {"Animations", "App designing", "App development", "Applied mathematics ", "Artificial intelligence ","Basic physical sciences ",
            "Circuits", "Communication", "Computers", "Concrete technology ", "Creating Electronic devices", "Creating Internet based working things",
            "Data Protection", "Data science", "Data security", "Electrical circuit creation", "Electrical machines creation", "Electricity basics",
            "Electro magnetic fields", "Electro magnetics", "Environmental engineering ", "Fluid mechanics ", "Geotechnical engineering ",
            "Graphics designing", "Hacking", "How electrical devices work", "How electronic devices are made", "Integrated circuits ",
            "Interest in Material & engines development", "Internet based", "Kinematics", "Machine Modelling", "Machine designing",
            "Make power for electrical components", "Making machines to think", "Material sciences and their structures", "Mathematics ",
            "Mechanical work", "Networks ", "Online and Computers", "Playing with machines", "Programming", "Robotics", "Signals and systems",
            "Solid mechanics", "Statistics and dynamics ", "Surveying ", "Switching and Circuits", "Testing Electronic devices",
            "Transportation engineering ", "Water resource engineering ", "Web designing", "Windows", "Wireless network communication",
            };

    static String arr[] = {"Animation is a method in which pictures are manipulated to appear as moving images. In traditional animation, images are drawn or painted by hand on transparent celluloid sheets to be photographed and exhibited on film.","  App designing means the preparation of the outlook of a app generating its prototype model(blueprint) by imagining its original product", "App development is the act or process by which a app is developed for mobile devices, such as personal digital assistants, enterprise digital assistants or mobile phones", "Applied mathematics is the application of mathematical methods by different fields such as science, engineering, business, computer science, and industry. Thus, applied mathematics is a combination of mathematical science and specialized knowledge.","Artificial intelligence (AI), sometimes called machine intelligence, is intelligence demonstrated by machines, in contrast to the natural intelligence displayed by humans.","Physical science is a branch of natural science that studies non-living systems, in contrast to life science. It in turn has many branches",
            "circuit is composed of individual electronic components, such as resistors, transistors, capacitors, inductors and diodes, connected by conductive wires or traces through which electric current can flow.","Communication is simply the act of transferring information from one place, person or group to another. Every communication involves (at least) one sender, a message and a recipient.","computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming. Modern computers have the ability to follow generalized sets of operations, called programs.","Concrete Technology. In its simplest form, concrete is a mixture of paste and aggregates (rocks). ... These qualities explain why one material, concrete, can build skyscrapers, bridges, sidewalks and superhighways, houses and dams.","creating electronic gadgets by using some  requirements and modelling some devices run  by using electricity","creating some  models which run using internet that even may be an app or an website or webpage ",
            "Data protection is the process of safeguarding important information from corruption, compromise or loss. The importance of data protection increases as the amount of data created and stored continues to grow at unprecedented rates","Data science is a multi-disciplinary field that uses scientific methods, processes, algorithms and system to extract knowledge and insights from structured and unstructured data.","Data security refers to protective digital privacy measures that are applied to prevent unauthorized access to computers, databases and websites. It protects data from corruption. Data security is an essential aspect of IT for organizations of every size and type.","The inventions which could produce a continuous flow of current -- made possible the development of the first electric circuits. ","Electrical machine is a device which converts mechanical energy into electrical energy or vice versa (generators ... Construction and working of a DC generator.","The Volt. The pressure that is put on free electrons that causes them to flow is known as electromotive force (EMF). ","An electromagnetic field is a physical field produced by moving electrically charged objects. It affects the behavior of non-comoving charged objects at any distance of the field.","Electromagnetism is a branch of physics involving the study of the electromagnetic force, a type of physical interaction that occurs between electrically charged particles.","Environmental engineering is a professonal engineering discipline that takes from broad scientific topics like chemistry, biology, ecology, geology, hydraulics, hydrology, microbiology, and mathematics.",      "Fluid mechanics is the branch of physics concerned with the mechanics of fluids and the forces on them. It   applications in a wide range of disciplines, including mechanical, civil, chemical and biomedical engineering, geophysics, oceanography, meteorology, astrophysics, and biology","Geotechnical engineering is the branch of engineering concerned with the analysis, design and construction of foundations, slopes, retaining structures, embankments, tunnels, levees, wharves, landfills and other systems that are made of or are supported by soil or rock.","Graphic design is the process of visual communication and problem-solving through the use of typography, photography, and illustration.","A security hacker is someone who explores methods for breaching defenses and exploiting weaknesses in a computer system or network.","Electrical devices take the energy of electrical current, the flow of electrons in a conductor, and transform it in simple ways into some other form of energy—most likely light, heat, or motion.","In an integrated circuit, electronic components such as resistors, capacitors, diodes, and transistors are formed directly onto the surface of a silicon crystal. ... Other dopants bond with the silicon to produce regions where the dopant atoms have room to take one electron.","An integrated circuit or monolithic integrated circuit is a set of electronic circuits on one small flat piece of semiconductor material that is normally silicon.","The interdisciplinary field of materials science, also commonly termed materials ... Materials science has driven, and been driven by, the development of revolutionary technologies","Mobile Internet when you want it! Always connected, wherever you are, with your smartphone, tablet or laptop - and on Belgium’s fastest mobile network!* BASE has several mobile Internet options designed especially for you, whether you have a monthly plan or a prepaid card.","the branch of mechanics concerned with the motion of objects without reference to the forces which cause the motion."  ,
            "In the case of the mechanical domain, these two variables are angular speed and torque. The mechanical models in Multisim use through-variables to represent torque and across-variables to represent angular speed. Therefore when working with mechanical variables in Multisim, voltage represents angular speed (in rad/s) and current represents torque "," Machine design is defined as the use of imagination, scientific principles and engineering techniques to create a machine or structure economically, in order to satisfy the requirements of a customer","Energy can never be created or destroyed, only transferred to another form. A lot of what were doing in electronics is converting different forms of energy to and from electric energy. Lighting LEDs turns electric energy into electromagnetic energy. Spinning motors turns electric energy into mechanical energy. Buzzing buzzers makes sound energy","Artificial intelligence and machine learning have become buzzwords over the last several years. Everybody talks about it, explains it and runs workshops. The whole world today is about intelligent computers. Companies invest in them to drive internal and business systems","Materials can generally be further divided into two classes: crystalline and non-crystalline. The traditional examples of materials are metals, semiconductors, ceramics and polymers. ... The basis of materials science involves studying the structure of materials, and relating them to their properties","Mathematicians seek and use patterns[8][9] to formulate new conjectures; they resolve the truth or falsity of conjectures by mathematical proof. When mathematical structures are good models of real phenomena, then mathematical reasoning can provide insight or predictions about nature","In physics, mechanical work is the amount of energy transferred by a force. Like energy, it is a scalar quantity, with SI units of joules. Heat conduction is not considered to be a form of work, since there is no macroscopically measurable force, only microscopic forces occurring in atomic collisions","A computer network is a digital telecommunications network which allows nodes to share resources. In computer networks, computing devices exchange data with each other using connections between nodes. These data links are established over cable media such as wires or optic cables, or wireless media such as Wi-Fi","In computer technology and telecommunications, online indicates a state of connectivity, and offline indicates a disconnected state. In modern terminology this usually refers to an Internet connection, but  could refer to any piece of equipment or functional unit that is connected to a larger system",
            "Machines that are helpful we can actually create them work with them and also play with them ","Computer programming is the process of designing and building an executable computer program for accomplishing a specific computing task.",  "Robotics deals with the design, construction, operation, and use of robots, as well as computer systems for their control, sensory feedback, and information processing. These technologies are used to develop machines that can substitute for humans and replicate human actions",
            "A system is any process that produces an output signal in response to an input signal. ... Continuous systems input and output continuous signals, such as in analog electronics. Discrete systems input and output discrete signals, such as computer programs that manipulate the values stored in arrays.", "Solid mechanics, also known as mechanics of solids, is the branch of continuum mechanics that studies the behavior of solid materials, especially their motion and deformation under the action of forces, temperature changes, phase changes, and other external or internal agents.", "Informally, dynamics is the study of forces and motion. ... In contrast, statics is the study of forces without motion; or more formally, the branch of mechanics that deals with forces in the absence of changes in motion. Dynamics implies change. Statics implies changelessness.", "Surveying or land surveying is the technique, profession, art and science of determining the terrestrial or three-dimensional positions of points and the distances and angles between them. A land surveying professional is called a land surveyor.", "Circuit switching is a method of implementing a telecommunications network in which two network nodes establish a dedicated communications channel through the network before the nodes may communicate","The testing equipment used to detect faults in the operation of electronic devices by creating stimulus signals and capture responses from electronic devices under test is known as electronic test equipment","Transportation engineering or transport engineering is the application of technology and scientific principles to the planning, functional design, operation and management of facilities for any mode of transportation","Water resources engineering is a specialty of civil engineering that focuses on water supplies, irrigation and waste disposal. It also addresses methods for controlling water to avoid water-related damage and catastrophes.","Web design encompasses many different skills and disciplines in the production and maintenance of websites.","Microsoft Windows is a group of several graphical operating system families, all of which are developed, marketed and sold by Microsoft. Each family caters to a certain sector of the computing industry.","A wireless network is a computer network that uses wireless data connections between network nodes. ... Wireless telecommunications networks are generally implemented and administered using radio communication"
    };

    static Integer[] idarr = {R.drawable.cse,R.drawable.cse,R.drawable.cse,R.drawable.mech,R.drawable.cse,R.drawable.civ,R.drawable.ece,R.drawable.eee,R.drawable.cse,R.drawable. civ,R.drawable.ece,R.drawable.it,R.drawable.it,R.drawable.cse,R.drawable.it,R.drawable.eee,R.drawable.ece,R.drawable.eee,R.drawable.ece,R.drawable.eee,R.drawable.civ,R.drawable.civ,R.drawable.mech,R.drawable.cse,R.drawable.it,R.drawable.ece,R.drawable.ece,R.drawable.ece,R.drawable.mech,R.drawable.it,R.drawable.civ,R.drawable.mech,R.drawable.mech,R.drawable.eee,R.drawable.cse,R.drawable.mech,R.drawable.civ,R.drawable.mech,R.drawable.ece,R.drawable.it,R.drawable.mech,R.drawable.cse,R.drawable.ece,R.drawable.ece,R.drawable.mech,R.drawable.civ,R.drawable.civ,R.drawable.eee,R.drawable.ece,R.drawable.civ,R.drawable.civ,R.drawable.cse,R.drawable.cse,R.drawable.ece};


    public static List<String> descriptions =Arrays.asList(arr);
    public static List<Integer> imageIds =Arrays.asList(idarr);


    List<String> selectTopicArrayList;
    RecyclerView selectTopicRecylcerView;
    SelectTopicRecyclerView adapter;
    TextView next  ;


    public static List<String> resultSet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_topics);

        selectTopicArrayList = Arrays.asList(selectTopicsArray);
        next = findViewById(R.id.nextAST);
        selectTopicRecylcerView = findViewById(R.id.selectTopicRecyclerView);
        adapter = new SelectTopicRecyclerView(selectTopicArrayList);
        selectTopicRecylcerView.setLayoutManager(new LinearLayoutManager(SelectTopicsActivity.this));
        selectTopicRecylcerView.setHasFixedSize(true);
        selectTopicRecylcerView.setAdapter(adapter);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectTopicsActivity.this,FinalActivity.class);
                String arr[] = new String[resultSet.size()];
                intent.putExtra("result",resultSet.toArray(arr));
                startActivity(intent);

            }
        });



    }
}
