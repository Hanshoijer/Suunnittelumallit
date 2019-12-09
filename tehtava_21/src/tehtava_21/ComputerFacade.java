package tehtava_21;

public class ComputerFacade {

	private final CPU processor;
	private final Memory ram;
	private final HardDrive hd;
	
	private long BOOT_ADDRESS = 255;
	private long BOOT_SECTOR = 255;
	private int SECTOR_SIZE = 255;
	
	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}
	
	public void start() {
		System.out.println("Computer start");
		processor.freeze();
		ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		processor.jump(BOOT_ADDRESS);
		processor.execute();
	}
}
