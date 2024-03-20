package org.example;

public class SpaceAge {
    private final double seconds;

    SpaceAge(double seconds) {
this.seconds=seconds;    }

    double getSeconds() {
return seconds;    }

    double onEarth() {

return this.getSeconds()/31557600.0;    }

    double onMercury() {
return this.getSeconds()/7600525.80461;    }

    double onVenus() {
return this.getSeconds()/19411026.1759;    }

    double onMars() {
return this.getSeconds()/59360959.8384;    }

    double onJupiter() {
return this.getSeconds()/374222565.145;    }

    double onSaturn() {
return this.getSeconds()/930232558.14;    }

    double onUranus() {
return this.getSeconds()/2630703165.22;    }

    double onNeptune() {
return this.getSeconds()/5202924160L;
    }
}
