package WireComponents;

/**
 * Created by Konrad on 15.05.2017.
 */
public class ComponentBoardFactory extends ComponentFactory {//Extension of ComponentFactory - returns boards with components instead of components

    public Board getBoardComponent(String compType){
        Component newComponent = null;
        int[] loc={0,0};
        int rotation = 0;
        boolean connected = false;
        switch (compType){
            case "Diode":
                newComponent = new Diode(rotation,loc,connected);
                break;
            case "ORgate":
                newComponent = new ORgate(rotation,loc,connected);
                break;
            case "ExORgate":
                newComponent = new ExORgate(rotation,loc,connected);
                break;
            case "ClockGen":
                newComponent = new ClockGen(rotation,loc,connected);
                break;
        }
        if(newComponent!=null){
            return new Board(newComponent.structure,newComponent.structure.length,newComponent.structure[0].length);
        }else{
            return null;
        }
    }
}
