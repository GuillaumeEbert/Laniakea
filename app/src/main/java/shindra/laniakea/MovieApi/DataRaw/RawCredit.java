package shindra.laniakea.MovieApi.DataRaw;

import java.util.List;

import shindra.laniakea.MovieApi.DataUsable.Cast;

/**
 * Created by Guillaume on 01/02/2018.
 */

public class RawCredit {

    /**
     * id : 25
     * cast : [{"cast_id":1,"character":"Staff Sgt. Sykes","credit_id":"52fe4210c3a36847f8001103","gender":2,"id":134,"name":"Jamie Foxx","order":0,"profile_path":"/cDRGXCNrwf1p9jouw9GzhU2vWP7.jpg"},{"cast_id":2,"character":"Anthony Swofford","credit_id":"52fe4210c3a36847f8001107","gender":2,"id":131,"name":"Jake Gyllenhaal","order":1,"profile_path":"/wRgIPBzVzIIhWcdJAduPOKJJHsL.jpg"},{"cast_id":3,"character":"D.I. Fitch","credit_id":"52fe4210c3a36847f800110b","gender":2,"id":132,"name":"Scott MacDonald","order":1,"profile_path":"/2QfBVz2TWjFOvOny8kvjWMtIGEL.jpg"},{"cast_id":15,"character":"Kruger","credit_id":"52fe4210c3a36847f800114f","gender":2,"id":155,"name":"Lucas Black","order":3,"profile_path":"/41qZZc6vRVm5ZOoXWfEf5NGoIZR.jpg"},{"cast_id":4,"character":"Alan Troy","credit_id":"52fe4210c3a36847f800110f","gender":2,"id":133,"name":"Peter Sarsgaard","order":4,"profile_path":"/dGoUlDEJumPY0CFlT7eM6KVdLUu.jpg"},{"cast_id":16,"character":"Ramon Escobar","credit_id":"52fe4210c3a36847f8001153","gender":2,"id":10964,"name":"Laz Alonso","order":5,"profile_path":"/6zqlURffzAErl4g4d8kiUWYWmoz.jpg"},{"cast_id":17,"character":"Lt. Col. Kazinski","credit_id":"52fe4210c3a36847f8001157","gender":2,"id":2955,"name":"Chris Cooper","order":6,"profile_path":"/ytZY7YofdiAZyiyr4NyiB77lwwQ.jpg"},{"cast_id":18,"character":"Fergus O'Donnell","credit_id":"52fe4210c3a36847f800115b","gender":2,"id":49271,"name":"Brian Geraghty","order":7,"profile_path":"/3risyyYIFDQaz0EHRVqNOCToaDe.jpg"},{"cast_id":19,"character":"Poitier","credit_id":"52fe4210c3a36847f800115f","gender":2,"id":150194,"name":"Damion Poitier","order":8,"profile_path":"/zBoq4SAauhVmbHSyWZXYXvA36Ky.jpg"},{"cast_id":20,"character":"Corporal Harrigan","credit_id":"52fe4210c3a36847f8001163","gender":2,"id":17697,"name":"John Krasinski","order":9,"profile_path":"/nOWwdZURikW22qo6OUSGFCTukgc.jpg"},{"cast_id":21,"character":"Julius","credit_id":"52fe4210c3a36847f8001167","gender":2,"id":107939,"name":"Jocko Sims","order":10,"profile_path":"/uR9Aej6VCIuyV39wAQhY6R0vGeZ.jpg"},{"cast_id":23,"character":"Branded Marine","credit_id":"52fe4210c3a36847f800116f","gender":2,"id":95698,"name":"Kevin Foster","order":12,"profile_path":"/9YZigxSi9V4mdpzxvs6G1nVRPbC.jpg"},{"cast_id":24,"character":"Nurse","credit_id":"52fe4210c3a36847f8001173","gender":0,"id":1291645,"name":"Riad Galayini","order":13,"profile_path":null},{"cast_id":25,"character":"Young Mr. Swofford","credit_id":"52fe4210c3a36847f8001177","gender":0,"id":1172840,"name":"Craig Coyne","order":14,"profile_path":"/56w5dBjpxnFVh9s22h2YgM9xFXy.jpg"},{"cast_id":26,"character":"Young Mrs. Swofford","credit_id":"52fe4210c3a36847f800117b","gender":1,"id":557545,"name":"Katherine Randolph","order":15,"profile_path":"/gZrVRLrRl7VUyQBhiCLpmdQ5OjH.jpg"},{"cast_id":27,"character":"Swoff's Sister","credit_id":"52fe4210c3a36847f800117f","gender":0,"id":1291646,"name":"Honorine Bell","order":16,"profile_path":null},{"cast_id":28,"character":"Mrs. Swofford","credit_id":"52fe4210c3a36847f8001183","gender":1,"id":81462,"name":"Dendrie Taylor","order":17,"profile_path":"/mGFSoz0U4wkGGrt8ZFeEXnLOYr6.jpg"},{"cast_id":29,"character":"Mr. Swofford","credit_id":"53262c0e925141143900245a","gender":2,"id":62003,"name":"James Morrison","order":18,"profile_path":"/g0FoKjXMxeX4bA7GpCOKHtNzAfQ.jpg"},{"cast_id":30,"character":"Bored Gunny","credit_id":"55d2db15c3a3684635000795","gender":2,"id":945062,"name":"Ming Lo","order":19,"profile_path":"/tl7hDWAAqlJaDaWHx6Kor3Nt1zO.jpg"},{"cast_id":31,"character":"Major Lincoln","credit_id":"580cf06b925141701a01099f","gender":2,"id":352,"name":"Dennis Haysbert","order":20,"profile_path":"/mcP4D8C20QsdWBIdhKhf8rT0Nhl.jpg"},{"cast_id":128,"character":"Kristina","credit_id":"5a6bcd670e0a265efb000f22","gender":1,"id":115126,"name":"Brianne Davis","order":21,"profile_path":"/mLuElx58qw8XRBwpZS6BLuzp66C.jpg"}]
     * crew : [{"credit_id":"52fe4210c3a36847f8001115","department":"Directing","gender":2,"id":39,"job":"Director","name":"Sam Mendes","profile_path":"/5z89X9rB76JDblqMQ52fviwXxAN.jpg"},{"credit_id":"52fe4210c3a36847f800112d","department":"Writing","gender":2,"id":142,"job":"Author","name":"William Broyles Jr.","profile_path":"/10Hjkpizn579B28qUuy2OrUMVEU.jpg"},{"credit_id":"52fe4210c3a36847f8001133","department":"Writing","gender":2,"id":148,"job":"Author","name":"Anthony Swofford","profile_path":null},{"credit_id":"52fe4210c3a36847f8001139","department":"Camera","gender":2,"id":151,"job":"Director of Photography","name":"Roger Deakins","profile_path":"/pSCN7CfILlfQrxX43Kgqrx5mBYQ.jpg"},{"credit_id":"52fe4210c3a36847f800113f","department":"Sound","gender":2,"id":152,"job":"Original Music Composer","name":"Jim Morrison","profile_path":"/xVz0ZG84skFdFQHr60W4bDGvCx4.jpg"},{"credit_id":"52fe4210c3a36847f8001145","department":"Sound","gender":2,"id":153,"job":"Original Music Composer","name":"Thomas Newman","profile_path":"/nZSsNIrjbkqqxFYwsD3zcHskxdP.jpg"},{"credit_id":"52fe4210c3a36847f800114b","department":"Editing","gender":2,"id":154,"job":"Editor","name":"Walter Murch","profile_path":null},{"credit_id":"5a553fe70e0a2607e80189f3","department":"Production","gender":2,"id":135,"job":"Executive Producer","name":"Bobby Cohen","profile_path":null},{"credit_id":"5a5540009251417a970179bd","department":"Production","gender":1,"id":19862,"job":"Producer","name":"Lucy Fisher","profile_path":null},{"credit_id":"5a5540160e0a2607d7018c13","department":"Production","gender":1,"id":34885,"job":"Co-Producer","name":"Pippa Harris","profile_path":null},{"credit_id":"5a55402c9251417aa00180ee","department":"Production","gender":2,"id":136,"job":"Executive Producer","name":"Sam Mercer","profile_path":null},{"credit_id":"5a55403f0e0a2607d1018cf4","department":"Production","gender":2,"id":931,"job":"Producer","name":"Douglas Wick","profile_path":null},{"credit_id":"5a5540669251417aa0018111","department":"Production","gender":1,"id":495,"job":"Casting","name":"Debra Zane","profile_path":null},{"credit_id":"5a55407a0e0a2607e40192b7","department":"Art","gender":2,"id":4248,"job":"Production Design","name":"Dennis Gassner","profile_path":null},{"credit_id":"5a55408c0e0a2607e8018a96","department":"Art","gender":0,"id":957889,"job":"Supervising Art Director","name":"Stefan Dechant","profile_path":null},{"credit_id":"5a5540a0c3a3685ec3014bd4","department":"Art","gender":0,"id":9821,"job":"Art Direction","name":"Marco Niro","profile_path":null},{"credit_id":"5a5540b1c3a3685ee6016ac6","department":"Art","gender":1,"id":18900,"job":"Art Direction","name":"Christina Ann Wilson","profile_path":null},{"credit_id":"5a5540c60e0a2607d7018cb7","department":"Art","gender":1,"id":555,"job":"Set Decoration","name":"Nancy Haigh","profile_path":null},{"credit_id":"5a5540d90e0a2607d7018cc9","department":"Costume & Make-Up","gender":2,"id":8885,"job":"Costume Design","name":"Albert Wolsky","profile_path":null},{"credit_id":"5a568cfac3a3685ebc0299ca","department":"Art","gender":0,"id":1549198,"job":"Art Department Coordinator","name":"Chris Cummings","profile_path":null},{"credit_id":"5a568d4b0e0a2607d702de6a","department":"Art","gender":0,"id":1352958,"job":"Assistant Art Director","name":"A. Todd Holland","profile_path":null},{"credit_id":"5a568d5ec3a3685ee6029eb4","department":"Art","gender":0,"id":1404357,"job":"Conceptual Design","name":"Constantine Sekeris","profile_path":null},{"credit_id":"5a568d710e0a2607d102e132","department":"Art","gender":0,"id":1341851,"job":"Construction Coordinator","name":"Jeff Passanante","profile_path":null},{"credit_id":"5a568d849251417a9a02b225","department":"Art","gender":0,"id":1957571,"job":"Construction Foreman","name":"Edward L. Turk","profile_path":null},{"credit_id":"5a568daf0e0a2607e002d5b4","department":"Art","gender":0,"id":1594908,"job":"Greensman","name":"Richard J. Bell","profile_path":null},{"credit_id":"5a568dbec3a3685ecd02d8b0","department":"Art","gender":0,"id":1447582,"job":"Leadman","name":"Mark Weissenfluh","profile_path":null},{"credit_id":"5a568ddc9251417ab502bc97","department":"Art","gender":0,"id":1957574,"job":"Location Scout","name":"Rick Poyner","profile_path":null},{"credit_id":"5a568dea9251417ab502bca9","department":"Art","gender":0,"id":1077115,"job":"Production Illustrator","name":"Kasra Farahani","profile_path":null},{"credit_id":"5a568dfd0e0a2607d702dede","department":"Art","gender":0,"id":1457638,"job":"Sculptor","name":"Carol Koch","profile_path":null},{"credit_id":"5a568e0d9251417aa002ce5c","department":"Art","gender":0,"id":1322481,"job":"Set Designer","name":"John Chichester","profile_path":null},{"credit_id":"5a568e26c3a3685ecd02d900","department":"Camera","gender":0,"id":1463701,"job":"Camera Technician","name":"Greg Beaumonte","profile_path":null},{"credit_id":"5a568e550e0a2607ec02d936","department":"Camera","gender":0,"id":1573081,"job":"First Assistant Camera","name":"Andy Harris","profile_path":null},{"credit_id":"5a568e6f9251417aa602bd9f","department":"Camera","gender":0,"id":1573082,"job":"Key Grip","name":"Mitchell Andrew Lillian","profile_path":null},{"credit_id":"5a568e8e0e0a2607e802daeb","department":"Camera","gender":0,"id":1957578,"job":"Grip","name":"Brian Branton","profile_path":null},{"credit_id":"5a568e9b0e0a2607e802dafc","department":"Crew","gender":2,"id":91932,"job":"Aerial Coordinator","name":"Cliff Fleming","profile_path":"/6xdXXFF7cZgbOl6mPZmQj5RFLmE.jpg"},{"credit_id":"5a568ee50e0a2607ec02d997","department":"Camera","gender":0,"id":1177850,"job":"Still Photographer","name":"François Duhamel","profile_path":null},{"credit_id":"5a568f549251417aa002cf71","department":"Costume & Make-Up","gender":2,"id":12040,"job":"Assistant Costume Designer","name":"George L. Little","profile_path":null},{"credit_id":"5a568f739251417aa002cf83","department":"Costume & Make-Up","gender":0,"id":1321589,"job":"Costume Supervisor","name":"Robert Q. Mathews","profile_path":null},{"credit_id":"5a568fb70e0a2607ec02da17","department":"Costume & Make-Up","gender":2,"id":32487,"job":"Hair Department Head","name":"Robert L. Stevenson","profile_path":null},{"credit_id":"5a568fca9251417aa002cfbe","department":"Costume & Make-Up","gender":0,"id":1412189,"job":"Hairstylist","name":"Deidra Dixon","profile_path":null},{"credit_id":"5a568fd90e0a2607d702e040","department":"Costume & Make-Up","gender":0,"id":1480098,"job":"Makeup Artist","name":"Steven E. Anderson","profile_path":null},{"credit_id":"5a568ffe0e0a2607e802dbe4","department":"Costume & Make-Up","gender":0,"id":1458898,"job":"Seamstress","name":"Blanca Garcia","profile_path":null},{"credit_id":"5a56900f0e0a2607d702e065","department":"Costume & Make-Up","gender":0,"id":1357067,"job":"Set Costumer","name":"Corey Bronson","profile_path":null},{"credit_id":"5a569021c3a3685ed703000b","department":"Costume & Make-Up","gender":0,"id":1414996,"job":"Set Dressing Artist","name":"Jack Blanchard","profile_path":null},{"credit_id":"5a5690489251417a9702c2ad","department":"Crew","gender":0,"id":1428857,"job":"Cableman","name":"Gary A. Theard","profile_path":null},{"credit_id":"5a56905b9251417aa902a9d9","department":"Crew","gender":0,"id":1619978,"job":"Craft Service","name":"John 'Magic' Wright","profile_path":null},{"credit_id":"5a56907d9251417aaf02ab0a","department":"Crew","gender":0,"id":1957579,"job":"Driver","name":"L. Chip Crosby Jr.","profile_path":null},{"credit_id":"5a569090c3a3685ecd02dacd","department":"Camera","gender":0,"id":1957580,"job":"Camera Loader","name":"Kirsten Laube","profile_path":null},{"credit_id":"5a5690c09251417aa902aa10","department":"Crew","gender":0,"id":1700116,"job":"Picture Car Coordinator","name":"Dennis McCarthy","profile_path":null},{"credit_id":"5a5690d49251417ab502bf23","department":"Crew","gender":0,"id":1476769,"job":"Post Production Supervisor","name":"Sean T. Stratton","profile_path":null},{"credit_id":"5a5694bec3a3685ec702b367","department":"Crew","gender":0,"id":1957582,"job":"Projection","name":"Robert Hatfield","profile_path":null},{"credit_id":"5a5694d09251417a9d02c02e","department":"Crew","gender":0,"id":1957583,"job":"Propmaker","name":"Mark Sparks","profile_path":null},{"credit_id":"5a5694de0e0a2607d102e6d6","department":"Art","gender":0,"id":1335066,"job":"Property Master","name":"Andrew Petrotta","profile_path":null},{"credit_id":"5a569533c3a3685ede02a517","department":"Crew","gender":0,"id":9624,"job":"Second Unit","name":"Jeff Habberstad","profile_path":null},{"credit_id":"5a5695520e0a2607d402da0c","department":"Crew","gender":0,"id":1957587,"job":"Set Medic","name":"Lindsay Hudson","profile_path":null},{"credit_id":"5a56955dc3a3685ee602a40e","department":"Crew","gender":0,"id":1948020,"job":"Set Production Assistant","name":"Cheryl Andryco","profile_path":null},{"credit_id":"5a56956fc3a3685ee602a411","department":"Crew","gender":0,"id":1311507,"job":"Special Effects Coordinator","name":"Steve Cremin","profile_path":null},{"credit_id":"5a5695809251417a9d02c098","department":"Crew","gender":0,"id":1957589,"job":"Stand In","name":"Chris Kephart","profile_path":null},{"credit_id":"5a5695bb9251417aa002d3e5","department":"Crew","gender":0,"id":9624,"job":"Stunt Coordinator","name":"Jeff Habberstad","profile_path":null},{"credit_id":"5a5695d7c3a3685ede02a57a","department":"Crew","gender":0,"id":1957590,"job":"Stunts","name":"Greg Anthony","profile_path":null},{"credit_id":"5a5696049251417a9702c665","department":"Crew","gender":0,"id":1549079,"job":"Technical Supervisor","name":"George A. Parker","profile_path":null},{"credit_id":"5a5696139251417aaf02ae97","department":"Crew","gender":0,"id":1551725,"job":"Transportation Captain","name":"Fred Teague","profile_path":null},{"credit_id":"5a569622c3a3685ecd02dea5","department":"Crew","gender":0,"id":1422420,"job":"Transportation Co-Captain","name":"Robert E. Dingle","profile_path":null},{"credit_id":"5a5696309251417aa602c30d","department":"Crew","gender":0,"id":1477799,"job":"Transportation Coordinator","name":"John A. Brubaker","profile_path":null},{"credit_id":"5a5696440e0a2607ec02ded8","department":"Production","gender":1,"id":8530,"job":"Unit Production Manager","name":"Sharon Mann","profile_path":null},{"credit_id":"5a5696670e0a2607e002dc31","department":"Crew","gender":0,"id":1405246,"job":"Unit Publicist","name":"Rob Harris","profile_path":null},{"credit_id":"5a5696829251417a9d02c148","department":"Crew","gender":0,"id":1957596,"job":"Utility Stunts","name":"Jeff M. Lewis","profile_path":null},{"credit_id":"5a5696919251417aaf02aeed","department":"Crew","gender":0,"id":1957597,"job":"Video Assist Operator","name":"Clark Higgins","profile_path":null},{"credit_id":"5a56969cc3a3685ee602a4d1","department":"Crew","gender":2,"id":1406756,"job":"Visual Effects Editor","name":"Kent Blocher","profile_path":null},{"credit_id":"5a5696ae9251417a9a02b8ca","department":"Directing","gender":0,"id":62543,"job":"First Assistant Director","name":"Alan B. Curtiss","profile_path":null},{"credit_id":"5a5696c0c3a3685ec702b4b4","department":"Directing","gender":0,"id":1957599,"job":"Layout","name":"Luke Longin","profile_path":null},{"credit_id":"5a5696cc9251417a9d02c174","department":"Directing","gender":0,"id":1342669,"job":"Script Supervisor","name":"Jayne-Ann Tenggren","profile_path":null},{"credit_id":"5a5696ddc3a3685ede02a62b","department":"Editing","gender":0,"id":1439431,"job":"Color Timer","name":"Kenny Becker","profile_path":null},{"credit_id":"5a5697749251417aa002d54a","department":"Sound","gender":0,"id":1389534,"job":"Dialogue Editor","name":"Richard Quinn","profile_path":null},{"credit_id":"5a5697850e0a2607d102e8c5","department":"Editing","gender":0,"id":1407823,"job":"Digital Intermediate","name":"Terra Bliss-Alvarez","profile_path":null},{"credit_id":"5a5697a7c3a3685ec3026a3d","department":"Lighting","gender":0,"id":1957611,"job":"Electrician","name":"Danny Ault","profile_path":null},{"credit_id":"5a5697e30e0a2607ce02e15d","department":"Lighting","gender":0,"id":1562249,"job":"Lighting Technician","name":"Ken W. Ballantine","profile_path":null},{"credit_id":"5a5697f59251417aa602c44d","department":"Lighting","gender":0,"id":1957612,"job":"Rigging Gaffer","name":"Edward R. Nedin","profile_path":null},{"credit_id":"5a5698050e0a2607e802e19c","department":"Lighting","gender":0,"id":1625901,"job":"Rigging Grip","name":"Gary Kangrga","profile_path":null},{"credit_id":"5a56982bc3a3685ecd02e022","department":"Production","gender":0,"id":1212071,"job":"Casting Associate","name":"Tannis Vallely","profile_path":null},{"credit_id":"5a569844c3a3685ed7030669","department":"Production","gender":0,"id":1190608,"job":"Location Manager","name":"Murray Miller","profile_path":null},{"credit_id":"5a569867c3a3685ed7030689","department":"Production","gender":0,"id":1771288,"job":"Production Accountant","name":"Mark Mayer","profile_path":null},{"credit_id":"5a56989fc3a3685ebc02a1ed","department":"Production","gender":0,"id":1564249,"job":"Production Coordinator","name":"Lois Walker","profile_path":null},{"credit_id":"5a5698c29251417a9702c86c","department":"Production","gender":0,"id":1573111,"job":"Production Supervisor","name":"Gerald Scaife","profile_path":null},{"credit_id":"5a5698d39251417a9d02c312","department":"Sound","gender":0,"id":1378229,"job":"Boom Operator","name":"Marvin E. Lewis","profile_path":null},{"credit_id":"5a5698e50e0a2607ec02e0e5","department":"Sound","gender":0,"id":1561360,"job":"Assistant Sound Editor","name":"Brian Chumney","profile_path":null},{"credit_id":"5a5698f60e0a2607d402dcba","department":"Sound","gender":0,"id":1454383,"job":"Foley","name":"Ben Conrad","profile_path":null},{"credit_id":"5a5699069251417a9d02c33f","department":"Sound","gender":2,"id":7538,"job":"Music Editor","name":"Bill Bernstein","profile_path":null},{"credit_id":"5a569948c3a3685ebf02b881","department":"Sound","gender":2,"id":52161,"job":"Music Supervisor","name":"Randall Poster","profile_path":null},{"credit_id":"5a569958c3a3685ed703078c","department":"Sound","gender":2,"id":1549209,"job":"Orchestrator","name":"Thomas Pasatieri","profile_path":null},{"credit_id":"5a569967c3a3685ebf02b8a5","department":"Sound","gender":0,"id":1558702,"job":"Scoring Mixer","name":"Thomas Vicari","profile_path":null},{"credit_id":"5a56997a0e0a2607d702e779","department":"Sound","gender":0,"id":5338,"job":"Sound Designer","name":"Kyrsten Mate","profile_path":null},{"credit_id":"5a56998ec3a3685ecd02e16d","department":"Sound","gender":0,"id":1438398,"job":"Sound Editor","name":"Larry Schalit","profile_path":null},{"credit_id":"5a56999e0e0a2607d402dd40","department":"Sound","gender":0,"id":5338,"job":"Sound Effects Editor","name":"Kyrsten Mate","profile_path":null},{"credit_id":"5a5699acc3a3685ec702b6f0","department":"Sound","gender":2,"id":1546115,"job":"Sound Mixer","name":"Willie D. Burton","profile_path":null},{"credit_id":"5a5699c3c3a3685ee602a764","department":"Sound","gender":0,"id":7069,"job":"Supervising Sound Editor","name":"Pat Jackson","profile_path":null},{"credit_id":"5a5699d69251417aa602c60c","department":"Visual Effects","gender":0,"id":1957617,"job":"Digital Compositors","name":"Matt Brumit","profile_path":null},{"credit_id":"5a569b319251417aa002d88f","department":"Visual Effects","gender":0,"id":1815501,"job":"Visual Effects Coordinator","name":"Christopher Cram","profile_path":null},{"credit_id":"5a569b71c3a3685ed7030960","department":"Visual Effects","gender":0,"id":1699156,"job":"Visual Effects Producer","name":"Jennifer C. Bell","profile_path":null},{"credit_id":"5a569b970e0a2607ec02e321","department":"Visual Effects","gender":0,"id":1377225,"job":"Visual Effects Supervisor","name":"Pablo Helman","profile_path":null},{"credit_id":"5a569bb7c3a3685ede02a9d5","department":"Writing","gender":0,"id":1957619,"job":"Storyboard","name":"Eric Ramsey","profile_path":null},{"credit_id":"5a569bd69251417aa602c7aa","department":"Crew","gender":0,"id":1414183,"job":"Visual Effects Art Director","name":"Christian Alzmann","profile_path":null},{"credit_id":"5a569c140e0a2607d702e9c2","department":"Editing","gender":0,"id":1957620,"job":"Additional Editing","name":"Pat Jackson","profile_path":null}]
     */

    private int id;
    private List<Cast> cast;
    private List<Crew> crew;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }



    public static class Crew {
        /**
         * credit_id : 52fe4210c3a36847f8001115
         * department : Directing
         * gender : 2
         * id : 39
         * job : Director
         * name : Sam Mendes
         * profile_path : /5z89X9rB76JDblqMQ52fviwXxAN.jpg
         */

        private String credit_id;
        private String department;
        private int gender;
        private int id;
        private String job;
        private String name;
        private String profile_path;

        public String getCredit_id() {
            return credit_id;
        }

        public void setCredit_id(String credit_id) {
            this.credit_id = credit_id;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProfile_path() {
            return profile_path;
        }

        public void setProfile_path(String profile_path) {
            this.profile_path = profile_path;
        }
    }
}
