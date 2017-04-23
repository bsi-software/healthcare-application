package org.eclipse.scout.healthcare.shared.person;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipse.scout.healthcare.client.person.EmployeePersonTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class EmployeePersonTablePageData extends AbstractPersonTablePageData {

  private static final long serialVersionUID = 1L;

  @Override
  public EmployeePersonTableRowData addRow() {
    return (EmployeePersonTableRowData) super.addRow();
  }

  @Override
  public EmployeePersonTableRowData addRow(int rowState) {
    return (EmployeePersonTableRowData) super.addRow(rowState);
  }

  @Override
  public EmployeePersonTableRowData createRow() {
    return new EmployeePersonTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return EmployeePersonTableRowData.class;
  }

  @Override
  public EmployeePersonTableRowData[] getRows() {
    return (EmployeePersonTableRowData[]) super.getRows();
  }

  @Override
  public EmployeePersonTableRowData rowAt(int index) {
    return (EmployeePersonTableRowData) super.rowAt(index);
  }

  public void setRows(EmployeePersonTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class EmployeePersonTableRowData extends AbstractPersonTableRowData {

    private static final long serialVersionUID = 1L;
  }
}