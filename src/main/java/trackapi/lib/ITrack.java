package trackapi.lib;

import net.minecraft.util.math.vector.Vector3d;

public interface ITrack {
	
	/**
	 * The distance between the rails measured in meters
	 * 
	 * @see Gauges#STANDARD
	 * @see Gauges#MINECRAFT
	 */
	public double getTrackGauge();
	
	/**
	 * Used by rolling stock to look up their next position.
	 * 
	 * @param currentPosition - Current entity or bogey position
	 * @param rotationYaw - Current entity rotation in degrees
	 * @param bogieYaw - Current bogey rotation in degrees (set to rotationYaw if unused)
	 * @param distance - Distanced traveled in meters
	 * @return The new position of the entity or bogey
	 */
	public Vector3d getNextPosition(Vector3d currentPosition, Vector3d motion);
}
