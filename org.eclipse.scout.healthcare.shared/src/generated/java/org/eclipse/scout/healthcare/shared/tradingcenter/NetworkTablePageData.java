package org.eclipse.scout.healthcare.shared.tradingcenter;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipse.scout.healthcare.client.tradingcenter.NetworkTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class NetworkTablePageData extends AbstractTablePageData {

  private static final long serialVersionUID = 1L;

  @Override
  public NetworkTableRowData addRow() {
    return (NetworkTableRowData) super.addRow();
  }

  @Override
  public NetworkTableRowData addRow(int rowState) {
    return (NetworkTableRowData) super.addRow(rowState);
  }

  @Override
  public NetworkTableRowData createRow() {
    return new NetworkTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return NetworkTableRowData.class;
  }

  @Override
  public NetworkTableRowData[] getRows() {
    return (NetworkTableRowData[]) super.getRows();
  }

  @Override
  public NetworkTableRowData rowAt(int index) {
    return (NetworkTableRowData) super.rowAt(index);
  }

  public void setRows(NetworkTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class NetworkTableRowData extends AbstractTableRowData {

    private static final long serialVersionUID = 1L;
    public static final String localDealId = "localDealId";
    public static final String dealId = "dealId";
    public static final String sort = "sort";
    public static final String ownDeal = "ownDeal";
    public static final String isMatched = "isMatched";
    public static final String side = "side";
    public static final String buyerSide = "buyerSide";
    public static final String buyerOrganization = "buyerOrganization";
    public static final String buyerTime = "buyerTime";
    public static final String buyerQuantity = "buyerQuantity";
    public static final String exchangeRate = "exchangeRate";
    public static final String sellerQuantity = "sellerQuantity";
    public static final String sellerTime = "sellerTime";
    public static final String sellerOrganization = "sellerOrganization";
    public static final String sellerSide = "sellerSide";
    private String m_localDealId;
    private Long m_dealId;
    private Long m_sort;
    private Boolean m_ownDeal;
    private Boolean m_isMatched;
    private String m_side;
    private String m_buyerSide;
    private String m_buyerOrganization;
    private Date m_buyerTime;
    private Long m_buyerQuantity;
    private Double m_exchangeRate;
    private Long m_sellerQuantity;
    private Date m_sellerTime;
    private String m_sellerOrganization;
    private String m_sellerSide;

    public String getLocalDealId() {
      return m_localDealId;
    }

    public void setLocalDealId(String newLocalDealId) {
      m_localDealId = newLocalDealId;
    }

    public Long getDealId() {
      return m_dealId;
    }

    public void setDealId(Long newDealId) {
      m_dealId = newDealId;
    }

    public Long getSort() {
      return m_sort;
    }

    public void setSort(Long newSort) {
      m_sort = newSort;
    }

    public Boolean getOwnDeal() {
      return m_ownDeal;
    }

    public void setOwnDeal(Boolean newOwnDeal) {
      m_ownDeal = newOwnDeal;
    }

    public Boolean getIsMatched() {
      return m_isMatched;
    }

    public void setIsMatched(Boolean newIsMatched) {
      m_isMatched = newIsMatched;
    }

    public String getSide() {
      return m_side;
    }

    public void setSide(String newSide) {
      m_side = newSide;
    }

    public String getBuyerSide() {
      return m_buyerSide;
    }

    public void setBuyerSide(String newBuyerSide) {
      m_buyerSide = newBuyerSide;
    }

    public String getBuyerOrganization() {
      return m_buyerOrganization;
    }

    public void setBuyerOrganization(String newBuyerOrganization) {
      m_buyerOrganization = newBuyerOrganization;
    }

    public Date getBuyerTime() {
      return m_buyerTime;
    }

    public void setBuyerTime(Date newBuyerTime) {
      m_buyerTime = newBuyerTime;
    }

    public Long getBuyerQuantity() {
      return m_buyerQuantity;
    }

    public void setBuyerQuantity(Long newBuyerQuantity) {
      m_buyerQuantity = newBuyerQuantity;
    }

    public Double getExchangeRate() {
      return m_exchangeRate;
    }

    public void setExchangeRate(Double newExchangeRate) {
      m_exchangeRate = newExchangeRate;
    }

    public Long getSellerQuantity() {
      return m_sellerQuantity;
    }

    public void setSellerQuantity(Long newSellerQuantity) {
      m_sellerQuantity = newSellerQuantity;
    }

    public Date getSellerTime() {
      return m_sellerTime;
    }

    public void setSellerTime(Date newSellerTime) {
      m_sellerTime = newSellerTime;
    }

    public String getSellerOrganization() {
      return m_sellerOrganization;
    }

    public void setSellerOrganization(String newSellerOrganization) {
      m_sellerOrganization = newSellerOrganization;
    }

    public String getSellerSide() {
      return m_sellerSide;
    }

    public void setSellerSide(String newSellerSide) {
      m_sellerSide = newSellerSide;
    }
  }
}