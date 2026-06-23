
package foodreservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the foodreservation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddMenu_QNAME = new QName("http://foodreservation/", "addMenu");
    private final static QName _AddMenuResponse_QNAME = new QName("http://foodreservation/", "addMenuResponse");
    private final static QName _AddOrderItem_QNAME = new QName("http://foodreservation/", "addOrderItem");
    private final static QName _AddOrderItemResponse_QNAME = new QName("http://foodreservation/", "addOrderItemResponse");
    private final static QName _CancelReservation_QNAME = new QName("http://foodreservation/", "cancelReservation");
    private final static QName _CancelReservationResponse_QNAME = new QName("http://foodreservation/", "cancelReservationResponse");
    private final static QName _ConfirmReservation_QNAME = new QName("http://foodreservation/", "confirmReservation");
    private final static QName _ConfirmReservationResponse_QNAME = new QName("http://foodreservation/", "confirmReservationResponse");
    private final static QName _DeleteMenu_QNAME = new QName("http://foodreservation/", "deleteMenu");
    private final static QName _DeleteMenuResponse_QNAME = new QName("http://foodreservation/", "deleteMenuResponse");
    private final static QName _DeleteOrderItem_QNAME = new QName("http://foodreservation/", "deleteOrderItem");
    private final static QName _DeleteOrderItemResponse_QNAME = new QName("http://foodreservation/", "deleteOrderItemResponse");
    private final static QName _FindAvailableTable_QNAME = new QName("http://foodreservation/", "findAvailableTable");
    private final static QName _FindAvailableTableResponse_QNAME = new QName("http://foodreservation/", "findAvailableTableResponse");
    private final static QName _GetAllMenuList_QNAME = new QName("http://foodreservation/", "getAllMenuList");
    private final static QName _GetAllMenuListResponse_QNAME = new QName("http://foodreservation/", "getAllMenuListResponse");
    private final static QName _GetAllReservations_QNAME = new QName("http://foodreservation/", "getAllReservations");
    private final static QName _GetAllReservationsResponse_QNAME = new QName("http://foodreservation/", "getAllReservationsResponse");
    private final static QName _GetMenuList_QNAME = new QName("http://foodreservation/", "getMenuList");
    private final static QName _GetMenuListResponse_QNAME = new QName("http://foodreservation/", "getMenuListResponse");
    private final static QName _GetOrderByReservation_QNAME = new QName("http://foodreservation/", "getOrderByReservation");
    private final static QName _GetOrderByReservationResponse_QNAME = new QName("http://foodreservation/", "getOrderByReservationResponse");
    private final static QName _GetReservationHistory_QNAME = new QName("http://foodreservation/", "getReservationHistory");
    private final static QName _GetReservationHistoryResponse_QNAME = new QName("http://foodreservation/", "getReservationHistoryResponse");
    private final static QName _GetTableList_QNAME = new QName("http://foodreservation/", "getTableList");
    private final static QName _GetTableListResponse_QNAME = new QName("http://foodreservation/", "getTableListResponse");
    private final static QName _GetUserIdByUsername_QNAME = new QName("http://foodreservation/", "getUserIdByUsername");
    private final static QName _GetUserIdByUsernameResponse_QNAME = new QName("http://foodreservation/", "getUserIdByUsernameResponse");
    private final static QName _GetUserList_QNAME = new QName("http://foodreservation/", "getUserList");
    private final static QName _GetUserListResponse_QNAME = new QName("http://foodreservation/", "getUserListResponse");
    private final static QName _GetUserRole_QNAME = new QName("http://foodreservation/", "getUserRole");
    private final static QName _GetUserRoleResponse_QNAME = new QName("http://foodreservation/", "getUserRoleResponse");
    private final static QName _Login_QNAME = new QName("http://foodreservation/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://foodreservation/", "loginResponse");
    private final static QName _MakeReservation_QNAME = new QName("http://foodreservation/", "makeReservation");
    private final static QName _MakeReservationResponse_QNAME = new QName("http://foodreservation/", "makeReservationResponse");
    private final static QName _Register_QNAME = new QName("http://foodreservation/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://foodreservation/", "registerResponse");
    private final static QName _UpdateMenu_QNAME = new QName("http://foodreservation/", "updateMenu");
    private final static QName _UpdateMenuResponse_QNAME = new QName("http://foodreservation/", "updateMenuResponse");
    private final static QName _UpdateOrderStatus_QNAME = new QName("http://foodreservation/", "updateOrderStatus");
    private final static QName _UpdateOrderStatusResponse_QNAME = new QName("http://foodreservation/", "updateOrderStatusResponse");
    private final static QName _UpdateProfile_QNAME = new QName("http://foodreservation/", "updateProfile");
    private final static QName _UpdateProfileResponse_QNAME = new QName("http://foodreservation/", "updateProfileResponse");
    private final static QName _UpdateTableStatus_QNAME = new QName("http://foodreservation/", "updateTableStatus");
    private final static QName _UpdateTableStatusResponse_QNAME = new QName("http://foodreservation/", "updateTableStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: foodreservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMenu }
     * 
     */
    public AddMenu createAddMenu() {
        return new AddMenu();
    }

    /**
     * Create an instance of {@link AddMenuResponse }
     * 
     */
    public AddMenuResponse createAddMenuResponse() {
        return new AddMenuResponse();
    }

    /**
     * Create an instance of {@link AddOrderItem }
     * 
     */
    public AddOrderItem createAddOrderItem() {
        return new AddOrderItem();
    }

    /**
     * Create an instance of {@link AddOrderItemResponse }
     * 
     */
    public AddOrderItemResponse createAddOrderItemResponse() {
        return new AddOrderItemResponse();
    }

    /**
     * Create an instance of {@link CancelReservation }
     * 
     */
    public CancelReservation createCancelReservation() {
        return new CancelReservation();
    }

    /**
     * Create an instance of {@link CancelReservationResponse }
     * 
     */
    public CancelReservationResponse createCancelReservationResponse() {
        return new CancelReservationResponse();
    }

    /**
     * Create an instance of {@link ConfirmReservation }
     * 
     */
    public ConfirmReservation createConfirmReservation() {
        return new ConfirmReservation();
    }

    /**
     * Create an instance of {@link ConfirmReservationResponse }
     * 
     */
    public ConfirmReservationResponse createConfirmReservationResponse() {
        return new ConfirmReservationResponse();
    }

    /**
     * Create an instance of {@link DeleteMenu }
     * 
     */
    public DeleteMenu createDeleteMenu() {
        return new DeleteMenu();
    }

    /**
     * Create an instance of {@link DeleteMenuResponse }
     * 
     */
    public DeleteMenuResponse createDeleteMenuResponse() {
        return new DeleteMenuResponse();
    }

    /**
     * Create an instance of {@link DeleteOrderItem }
     * 
     */
    public DeleteOrderItem createDeleteOrderItem() {
        return new DeleteOrderItem();
    }

    /**
     * Create an instance of {@link DeleteOrderItemResponse }
     * 
     */
    public DeleteOrderItemResponse createDeleteOrderItemResponse() {
        return new DeleteOrderItemResponse();
    }

    /**
     * Create an instance of {@link FindAvailableTable }
     * 
     */
    public FindAvailableTable createFindAvailableTable() {
        return new FindAvailableTable();
    }

    /**
     * Create an instance of {@link FindAvailableTableResponse }
     * 
     */
    public FindAvailableTableResponse createFindAvailableTableResponse() {
        return new FindAvailableTableResponse();
    }

    /**
     * Create an instance of {@link GetAllMenuList }
     * 
     */
    public GetAllMenuList createGetAllMenuList() {
        return new GetAllMenuList();
    }

    /**
     * Create an instance of {@link GetAllMenuListResponse }
     * 
     */
    public GetAllMenuListResponse createGetAllMenuListResponse() {
        return new GetAllMenuListResponse();
    }

    /**
     * Create an instance of {@link GetAllReservations }
     * 
     */
    public GetAllReservations createGetAllReservations() {
        return new GetAllReservations();
    }

    /**
     * Create an instance of {@link GetAllReservationsResponse }
     * 
     */
    public GetAllReservationsResponse createGetAllReservationsResponse() {
        return new GetAllReservationsResponse();
    }

    /**
     * Create an instance of {@link GetMenuList }
     * 
     */
    public GetMenuList createGetMenuList() {
        return new GetMenuList();
    }

    /**
     * Create an instance of {@link GetMenuListResponse }
     * 
     */
    public GetMenuListResponse createGetMenuListResponse() {
        return new GetMenuListResponse();
    }

    /**
     * Create an instance of {@link GetOrderByReservation }
     * 
     */
    public GetOrderByReservation createGetOrderByReservation() {
        return new GetOrderByReservation();
    }

    /**
     * Create an instance of {@link GetOrderByReservationResponse }
     * 
     */
    public GetOrderByReservationResponse createGetOrderByReservationResponse() {
        return new GetOrderByReservationResponse();
    }

    /**
     * Create an instance of {@link GetReservationHistory }
     * 
     */
    public GetReservationHistory createGetReservationHistory() {
        return new GetReservationHistory();
    }

    /**
     * Create an instance of {@link GetReservationHistoryResponse }
     * 
     */
    public GetReservationHistoryResponse createGetReservationHistoryResponse() {
        return new GetReservationHistoryResponse();
    }

    /**
     * Create an instance of {@link GetTableList }
     * 
     */
    public GetTableList createGetTableList() {
        return new GetTableList();
    }

    /**
     * Create an instance of {@link GetTableListResponse }
     * 
     */
    public GetTableListResponse createGetTableListResponse() {
        return new GetTableListResponse();
    }

    /**
     * Create an instance of {@link GetUserIdByUsername }
     * 
     */
    public GetUserIdByUsername createGetUserIdByUsername() {
        return new GetUserIdByUsername();
    }

    /**
     * Create an instance of {@link GetUserIdByUsernameResponse }
     * 
     */
    public GetUserIdByUsernameResponse createGetUserIdByUsernameResponse() {
        return new GetUserIdByUsernameResponse();
    }

    /**
     * Create an instance of {@link GetUserList }
     * 
     */
    public GetUserList createGetUserList() {
        return new GetUserList();
    }

    /**
     * Create an instance of {@link GetUserListResponse }
     * 
     */
    public GetUserListResponse createGetUserListResponse() {
        return new GetUserListResponse();
    }

    /**
     * Create an instance of {@link GetUserRole }
     * 
     */
    public GetUserRole createGetUserRole() {
        return new GetUserRole();
    }

    /**
     * Create an instance of {@link GetUserRoleResponse }
     * 
     */
    public GetUserRoleResponse createGetUserRoleResponse() {
        return new GetUserRoleResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link MakeReservation }
     * 
     */
    public MakeReservation createMakeReservation() {
        return new MakeReservation();
    }

    /**
     * Create an instance of {@link MakeReservationResponse }
     * 
     */
    public MakeReservationResponse createMakeReservationResponse() {
        return new MakeReservationResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link UpdateMenu }
     * 
     */
    public UpdateMenu createUpdateMenu() {
        return new UpdateMenu();
    }

    /**
     * Create an instance of {@link UpdateMenuResponse }
     * 
     */
    public UpdateMenuResponse createUpdateMenuResponse() {
        return new UpdateMenuResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderStatus }
     * 
     */
    public UpdateOrderStatus createUpdateOrderStatus() {
        return new UpdateOrderStatus();
    }

    /**
     * Create an instance of {@link UpdateOrderStatusResponse }
     * 
     */
    public UpdateOrderStatusResponse createUpdateOrderStatusResponse() {
        return new UpdateOrderStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateProfile }
     * 
     */
    public UpdateProfile createUpdateProfile() {
        return new UpdateProfile();
    }

    /**
     * Create an instance of {@link UpdateProfileResponse }
     * 
     */
    public UpdateProfileResponse createUpdateProfileResponse() {
        return new UpdateProfileResponse();
    }

    /**
     * Create an instance of {@link UpdateTableStatus }
     * 
     */
    public UpdateTableStatus createUpdateTableStatus() {
        return new UpdateTableStatus();
    }

    /**
     * Create an instance of {@link UpdateTableStatusResponse }
     * 
     */
    public UpdateTableStatusResponse createUpdateTableStatusResponse() {
        return new UpdateTableStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMenu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMenu }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "addMenu")
    public JAXBElement<AddMenu> createAddMenu(AddMenu value) {
        return new JAXBElement<AddMenu>(_AddMenu_QNAME, AddMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMenuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMenuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "addMenuResponse")
    public JAXBElement<AddMenuResponse> createAddMenuResponse(AddMenuResponse value) {
        return new JAXBElement<AddMenuResponse>(_AddMenuResponse_QNAME, AddMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddOrderItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "addOrderItem")
    public JAXBElement<AddOrderItem> createAddOrderItem(AddOrderItem value) {
        return new JAXBElement<AddOrderItem>(_AddOrderItem_QNAME, AddOrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrderItemResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddOrderItemResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "addOrderItemResponse")
    public JAXBElement<AddOrderItemResponse> createAddOrderItemResponse(AddOrderItemResponse value) {
        return new JAXBElement<AddOrderItemResponse>(_AddOrderItemResponse_QNAME, AddOrderItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "cancelReservation")
    public JAXBElement<CancelReservation> createCancelReservation(CancelReservation value) {
        return new JAXBElement<CancelReservation>(_CancelReservation_QNAME, CancelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "cancelReservationResponse")
    public JAXBElement<CancelReservationResponse> createCancelReservationResponse(CancelReservationResponse value) {
        return new JAXBElement<CancelReservationResponse>(_CancelReservationResponse_QNAME, CancelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "confirmReservation")
    public JAXBElement<ConfirmReservation> createConfirmReservation(ConfirmReservation value) {
        return new JAXBElement<ConfirmReservation>(_ConfirmReservation_QNAME, ConfirmReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "confirmReservationResponse")
    public JAXBElement<ConfirmReservationResponse> createConfirmReservationResponse(ConfirmReservationResponse value) {
        return new JAXBElement<ConfirmReservationResponse>(_ConfirmReservationResponse_QNAME, ConfirmReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMenu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMenu }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "deleteMenu")
    public JAXBElement<DeleteMenu> createDeleteMenu(DeleteMenu value) {
        return new JAXBElement<DeleteMenu>(_DeleteMenu_QNAME, DeleteMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMenuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMenuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "deleteMenuResponse")
    public JAXBElement<DeleteMenuResponse> createDeleteMenuResponse(DeleteMenuResponse value) {
        return new JAXBElement<DeleteMenuResponse>(_DeleteMenuResponse_QNAME, DeleteMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrderItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOrderItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "deleteOrderItem")
    public JAXBElement<DeleteOrderItem> createDeleteOrderItem(DeleteOrderItem value) {
        return new JAXBElement<DeleteOrderItem>(_DeleteOrderItem_QNAME, DeleteOrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrderItemResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOrderItemResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "deleteOrderItemResponse")
    public JAXBElement<DeleteOrderItemResponse> createDeleteOrderItemResponse(DeleteOrderItemResponse value) {
        return new JAXBElement<DeleteOrderItemResponse>(_DeleteOrderItemResponse_QNAME, DeleteOrderItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAvailableTable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAvailableTable }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "findAvailableTable")
    public JAXBElement<FindAvailableTable> createFindAvailableTable(FindAvailableTable value) {
        return new JAXBElement<FindAvailableTable>(_FindAvailableTable_QNAME, FindAvailableTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAvailableTableResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAvailableTableResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "findAvailableTableResponse")
    public JAXBElement<FindAvailableTableResponse> createFindAvailableTableResponse(FindAvailableTableResponse value) {
        return new JAXBElement<FindAvailableTableResponse>(_FindAvailableTableResponse_QNAME, FindAvailableTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMenuList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMenuList }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getAllMenuList")
    public JAXBElement<GetAllMenuList> createGetAllMenuList(GetAllMenuList value) {
        return new JAXBElement<GetAllMenuList>(_GetAllMenuList_QNAME, GetAllMenuList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMenuListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMenuListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getAllMenuListResponse")
    public JAXBElement<GetAllMenuListResponse> createGetAllMenuListResponse(GetAllMenuListResponse value) {
        return new JAXBElement<GetAllMenuListResponse>(_GetAllMenuListResponse_QNAME, GetAllMenuListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllReservations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllReservations }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getAllReservations")
    public JAXBElement<GetAllReservations> createGetAllReservations(GetAllReservations value) {
        return new JAXBElement<GetAllReservations>(_GetAllReservations_QNAME, GetAllReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllReservationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllReservationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getAllReservationsResponse")
    public JAXBElement<GetAllReservationsResponse> createGetAllReservationsResponse(GetAllReservationsResponse value) {
        return new JAXBElement<GetAllReservationsResponse>(_GetAllReservationsResponse_QNAME, GetAllReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMenuList }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getMenuList")
    public JAXBElement<GetMenuList> createGetMenuList(GetMenuList value) {
        return new JAXBElement<GetMenuList>(_GetMenuList_QNAME, GetMenuList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMenuListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getMenuListResponse")
    public JAXBElement<GetMenuListResponse> createGetMenuListResponse(GetMenuListResponse value) {
        return new JAXBElement<GetMenuListResponse>(_GetMenuListResponse_QNAME, GetMenuListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderByReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getOrderByReservation")
    public JAXBElement<GetOrderByReservation> createGetOrderByReservation(GetOrderByReservation value) {
        return new JAXBElement<GetOrderByReservation>(_GetOrderByReservation_QNAME, GetOrderByReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrderByReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getOrderByReservationResponse")
    public JAXBElement<GetOrderByReservationResponse> createGetOrderByReservationResponse(GetOrderByReservationResponse value) {
        return new JAXBElement<GetOrderByReservationResponse>(_GetOrderByReservationResponse_QNAME, GetOrderByReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationHistory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getReservationHistory")
    public JAXBElement<GetReservationHistory> createGetReservationHistory(GetReservationHistory value) {
        return new JAXBElement<GetReservationHistory>(_GetReservationHistory_QNAME, GetReservationHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getReservationHistoryResponse")
    public JAXBElement<GetReservationHistoryResponse> createGetReservationHistoryResponse(GetReservationHistoryResponse value) {
        return new JAXBElement<GetReservationHistoryResponse>(_GetReservationHistoryResponse_QNAME, GetReservationHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTableList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTableList }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getTableList")
    public JAXBElement<GetTableList> createGetTableList(GetTableList value) {
        return new JAXBElement<GetTableList>(_GetTableList_QNAME, GetTableList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTableListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTableListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getTableListResponse")
    public JAXBElement<GetTableListResponse> createGetTableListResponse(GetTableListResponse value) {
        return new JAXBElement<GetTableListResponse>(_GetTableListResponse_QNAME, GetTableListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserIdByUsername }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserIdByUsername }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getUserIdByUsername")
    public JAXBElement<GetUserIdByUsername> createGetUserIdByUsername(GetUserIdByUsername value) {
        return new JAXBElement<GetUserIdByUsername>(_GetUserIdByUsername_QNAME, GetUserIdByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserIdByUsernameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserIdByUsernameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getUserIdByUsernameResponse")
    public JAXBElement<GetUserIdByUsernameResponse> createGetUserIdByUsernameResponse(GetUserIdByUsernameResponse value) {
        return new JAXBElement<GetUserIdByUsernameResponse>(_GetUserIdByUsernameResponse_QNAME, GetUserIdByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserList }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getUserList")
    public JAXBElement<GetUserList> createGetUserList(GetUserList value) {
        return new JAXBElement<GetUserList>(_GetUserList_QNAME, GetUserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getUserListResponse")
    public JAXBElement<GetUserListResponse> createGetUserListResponse(GetUserListResponse value) {
        return new JAXBElement<GetUserListResponse>(_GetUserListResponse_QNAME, GetUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getUserRole")
    public JAXBElement<GetUserRole> createGetUserRole(GetUserRole value) {
        return new JAXBElement<GetUserRole>(_GetUserRole_QNAME, GetUserRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserRoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "getUserRoleResponse")
    public JAXBElement<GetUserRoleResponse> createGetUserRoleResponse(GetUserRoleResponse value) {
        return new JAXBElement<GetUserRoleResponse>(_GetUserRoleResponse_QNAME, GetUserRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "makeReservation")
    public JAXBElement<MakeReservation> createMakeReservation(MakeReservation value) {
        return new JAXBElement<MakeReservation>(_MakeReservation_QNAME, MakeReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "makeReservationResponse")
    public JAXBElement<MakeReservationResponse> createMakeReservationResponse(MakeReservationResponse value) {
        return new JAXBElement<MakeReservationResponse>(_MakeReservationResponse_QNAME, MakeReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMenu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMenu }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateMenu")
    public JAXBElement<UpdateMenu> createUpdateMenu(UpdateMenu value) {
        return new JAXBElement<UpdateMenu>(_UpdateMenu_QNAME, UpdateMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMenuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMenuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateMenuResponse")
    public JAXBElement<UpdateMenuResponse> createUpdateMenuResponse(UpdateMenuResponse value) {
        return new JAXBElement<UpdateMenuResponse>(_UpdateMenuResponse_QNAME, UpdateMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateOrderStatus")
    public JAXBElement<UpdateOrderStatus> createUpdateOrderStatus(UpdateOrderStatus value) {
        return new JAXBElement<UpdateOrderStatus>(_UpdateOrderStatus_QNAME, UpdateOrderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateOrderStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateOrderStatusResponse")
    public JAXBElement<UpdateOrderStatusResponse> createUpdateOrderStatusResponse(UpdateOrderStatusResponse value) {
        return new JAXBElement<UpdateOrderStatusResponse>(_UpdateOrderStatusResponse_QNAME, UpdateOrderStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateProfile")
    public JAXBElement<UpdateProfile> createUpdateProfile(UpdateProfile value) {
        return new JAXBElement<UpdateProfile>(_UpdateProfile_QNAME, UpdateProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProfileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateProfileResponse")
    public JAXBElement<UpdateProfileResponse> createUpdateProfileResponse(UpdateProfileResponse value) {
        return new JAXBElement<UpdateProfileResponse>(_UpdateProfileResponse_QNAME, UpdateProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTableStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTableStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateTableStatus")
    public JAXBElement<UpdateTableStatus> createUpdateTableStatus(UpdateTableStatus value) {
        return new JAXBElement<UpdateTableStatus>(_UpdateTableStatus_QNAME, UpdateTableStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTableStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTableStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://foodreservation/", name = "updateTableStatusResponse")
    public JAXBElement<UpdateTableStatusResponse> createUpdateTableStatusResponse(UpdateTableStatusResponse value) {
        return new JAXBElement<UpdateTableStatusResponse>(_UpdateTableStatusResponse_QNAME, UpdateTableStatusResponse.class, null, value);
    }

}
