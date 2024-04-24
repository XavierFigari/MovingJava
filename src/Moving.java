public class Moving {
    final int totalBoxes = 34;
    final int truckCapacity = 9;
    final boolean truckLoaded = false;
    int boxesInOldBuilding = totalBoxes;
    int boxesInNewBuilding = 0;
    int boxesInTruck;

    // public static void

    // moving.boxesInNewBuilding < moving.totalBoxes

    public static void main(String[] args) {
        System.out.println("Starting moving !");
        Moving moving = new Moving();
        while (! moving.movingFinished()) {
            int boxesMoved = moving.loadTruck();
            moving.takeTheRoad();
            moving.unloadTruck(boxesMoved);
        }
        System.out.println("Finished moving !");
    }

    private boolean movingFinished() {
        return boxesInNewBuilding == totalBoxes;
    }

    private void unloadTruck(int boxesMoved) {
        boxesInNewBuilding += boxesMoved;
        System.out.println("Unloading " + boxesMoved + " boxes to new building");
    }

    private void takeTheRoad() {
//        System.out.println("... truck is on the road ...");
    }

    private int loadTruck() {
        int boxesMoved;
        if (boxesInOldBuilding < truckCapacity) {
            boxesMoved = boxesInOldBuilding;
        } else {
            boxesMoved=truckCapacity;
        }
        boxesInOldBuilding-=boxesMoved;
//        System.out.println("Loading truck with " + boxesMoved + " boxes.");
        return boxesMoved;
    }

}