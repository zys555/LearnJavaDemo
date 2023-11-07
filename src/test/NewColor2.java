package test;

enum NewColor2 implements ColorInterface{
    红色{
        public String getColor(){
            return "RED";
        }
    },
    绿色{
        public String getColor(){
            return "GREEN";
        }
    },
    蓝色{
        public String getColor(){
            return "BLUE";
        }
    }
}

