package ch07;

/**
 * 
 *	class AirUnit extends Unit {}
	class GroundUnit extends Unit {}
	class Tank extends GroundUnit {}
	class AirCraft extends AirUnit {}
	Unit u = new GroundUnit();
	Tank t = new Tank();
	AirCraft ac = new AirCraft();
	
	
	a. u = (Unit)ac;
	b. u = ac;
	c. GroundUnit gu = (GroundUnit)u;
	d. AirUnit au = ac;
	e. t = (Tank)u;	// 조상인스턴스 -> 자손 타입으로 형변환 하는것은 불가능.
	f. GroundUnit gu = t;
 */

