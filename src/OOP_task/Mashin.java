package OOP_task;

    public class Mashin {
        String marka;
        String model;
        String reng ;
        int MotorHecmi;
        int QapiSayi;


        public Mashin (String marka, String model, String reng,int MotorHecmi, int QapiSayi)
        {
            this.marka = marka;
            this.model = model;
            this.reng = reng;
            this.MotorHecmi= MotorHecmi;
            this.QapiSayi = QapiSayi;
        }

        @Override
        public String toString() {
            return "Mashin{" +
                    "marka='" + marka + '\'' +
                    ", model='" + model + '\'' +
                    ", reng='" + reng + '\'' +
                    ", MotorHecmi=" + MotorHecmi +
                    ", QapiSayi=" + QapiSayi +
                    '}';
        }
    }
