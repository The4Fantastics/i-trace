<?xml version="1.0" encoding="ISO-8859-1"?>
<ASD:ServiceDescription xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ASD="http://ASD" name="POPService">
  <operations name="receivePO">
    <contents name="POMessage" infoType="//@infotypes.1"/>
  </operations>
  <operations name="receivePOCallBack" messagePattern="notification">
    <contents name="POMessageAck" role="output" subset="pro" infoType="//@infotypes.0 //@infotypes.2"/>
  </operations>
  <infotypes xsi:type="ASD:InfoTypeImported" name="string" valueType="string" subset="pro" message="//@operations.1/@contents.0" url="http://www.w3.org/2001/ XMLSchema"/>
  <infotypes name="PODocument" message="//@operations.0/@contents.0">
    <infoType name="OrderInfo" valueType="string" valueRange="" subset="unset"/>
    <infoType name="DeliveryInfo" valueType="string" valueRange="0-?" subset="unset"/>
    <infoType name="TimeStamp" valueType="date" valueRange="" subset="unset"/>
  </infotypes>
  <infotypes name="TimeStamp" valueType="date" valueRange="" subset="pro" message="//@operations.1/@contents.0"/>
</ASD:ServiceDescription>
