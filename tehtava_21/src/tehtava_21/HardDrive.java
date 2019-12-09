package tehtava_21;

public class HardDrive {

	
	public byte[] read(long lba, int size) {
		System.out.println("Harddrive read. data: " + lba + " size: " + size);
		return new byte[size];
	}
	
}
