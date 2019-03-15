package vin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class VINTest {

  @Test
  public void test1J4FF68S5XL503754() {
    VIN vin = new VIN("1J4FF68S5XL503754");
    assertEquals(vin.getYear(), 1999);
    assertEquals(vin.getSerialNumber(), "503754");
    assertEquals(vin.getCountryCode(), "1J");
    assertEquals(vin.getCountry(), "United States");
    assertFalse(vin.isLess500());
    assertEquals(vin.getVdsCode(), "FF68S");
    assertEquals(vin.getWMICode(), "1J4");
    assertEquals(vin.getPlantCode(), "L");
    assertEquals(vin.getManufacturerCode(), "J4");
  }

  @Test
  public void testLFVBA14B3Y3014078() {
    VIN vin = new VIN("LFVBA14B3Y3014078");
    assertEquals(vin.getYear(), 2000);
    assertEquals(vin.getSerialNumber(), "014078");
    assertEquals(vin.getCountryCode(), "LF");
    assertEquals(vin.getCountry(), "China");
    assertFalse(vin.isLess500());
    assertEquals(vin.getVdsCode(), "BA14B");
    assertEquals(vin.getWMICode(), "LFV");
    assertEquals(vin.getPlantCode(), "3");
    assertEquals(vin.getManufacturerCode(), "FV");
  }

  @Test
  public void testLS5A3ADE0AB046793() {
    VIN vin = new VIN("LS5A3ADE0AB046793");
    assertEquals(vin.getYear(), 1980);
    assertEquals(vin.getSerialNumber(), "046793");
    assertEquals(vin.getCountryCode(), "LS");
    assertEquals(vin.getCountry(), "China");
    assertFalse(vin.isLess500());
    assertEquals(vin.getVdsCode(), "A3ADE");
    assertEquals(vin.getWMICode(), "LS5");
    assertEquals(vin.getPlantCode(), "B");
    assertEquals(vin.getManufacturerCode(), "S5");
  }

}
