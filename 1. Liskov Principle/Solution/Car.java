package Solution;

class Car extends EngineGearbox {
    @Override
    public Integer numberOfWheels(){
        return 4;
    }

    @Override
    public String engineGearBox(){
        return "6-Speed";
    }
}