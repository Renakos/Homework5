// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBarrier("Protect");
        boss.setDamage(70);
        boss.setHealth(700);
        System.out.println("bossBarrier: " + boss.getBarrier() + " " + "bossDamage: " + boss.getDamage() + " " + "bossHealth: " + boss.getHealth());
        
    }
}