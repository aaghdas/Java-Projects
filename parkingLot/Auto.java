
package de.gfn.kursProjekte.parkingLot;

    public class Auto {
        private String mark;
        private String type;
        private String carNumber;
        private int productionYear;

        public Auto(String mark, String type, String carNumber, int productionYear) {
            this.mark = mark;
            this.type = type;
            this.carNumber = carNumber;
            this.productionYear = productionYear;
        }

        public String getMark() {
            return mark;
        }

        public void setMark(String mark) {
            this.mark = mark;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCarNumber() {
            return carNumber;
        }

        public void setCarNumber(String carNumber) {
            this.carNumber = carNumber;
        }

        public int getProductionYear() {
            return productionYear;
        }

        public void setProductionYear(int productionYear) {
            this.productionYear = productionYear;
        }

}


