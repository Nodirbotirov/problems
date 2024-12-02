package collection.flowbosConverter.payload;


public class Payload {

    /**
     * For responses
     **/

    public static ApiResponse api(HttpStatus status) {
        return new ApiResponse(status);
    }

    public static ApiResponse api(String message, HttpStatus status) {
        return new ApiResponse(message, status);
    }

    public static ApiResponse api(String message, boolean success) {
        return new ApiResponse(message, success);
    }

    public static ApiResponse api(String message, boolean success, HttpStatus status) {
        return new ApiResponse(message, success, status);
    }

    // with object
    public static ApiResponse api(HttpStatus status, Object object) {
        return new ApiResponseObject(status, object);
    }

    public static ApiResponse api(HttpStatus status, Object object, long totalElements, long totalPages, long page) {
        return new ApiResponseObject(status, totalElements, totalPages, page, object);
    }

    public static ApiResponse api(HttpStatus status, Object object, long totalElements, long totalPages, long page, boolean success) {
        return new ApiResponseObject(status, totalElements, totalPages, page, object,success);
    }

    public static ApiResponse api(String message, HttpStatus status, Object object) {
        return new ApiResponseObject(message, status, object);
    }

    public static ApiResponse api(String message, boolean success, Object object) {
        return new ApiResponseObject(message, success, object);
    }

    public static ApiResponse api(String message, boolean success, HttpStatus status, Object object) {
        return new ApiResponseObject(message, success, status, object);
    }


    /**
     * Success
     **/
    // Continue 100
    public static ApiResponse continues() {
        return api(HttpStatus.Continue);
    }

    public static ApiResponse continues(String message) {
        return api(message, HttpStatus.Continue);
    }

    public static ApiResponse continues(Object object) {
        return api(HttpStatus.Continue, object);
    }

    public static ApiResponse continues(String message, Object object) {
        return api(message, HttpStatus.Continue, object);
    }

    // SwitchingProtocols 101
    public static ApiResponse switchingProtocols() {
        return api(HttpStatus.SwitchingProtocols);
    }

    public static ApiResponse switchingProtocols(String message) {
        return api(message, HttpStatus.SwitchingProtocols);
    }

    public static ApiResponse switchingProtocols(Object object) {
        return api(HttpStatus.SwitchingProtocols, object);
    }

    public static ApiResponse switchingProtocols(String message, Object object) {
        return api(message, HttpStatus.SwitchingProtocols, object);
    }

    // OK 200
    public static ApiResponse ok() {
        return api(HttpStatus.OK);
    }

    public static ApiResponse ok(String message) {
        return api(message, HttpStatus.OK);
    }

    public static ApiResponse ok(Object object) {
        return api(HttpStatus.OK, object);
    }

    public static ApiResponse ok(Object object, long totalElements, long totalPages, long page) {
        return api(HttpStatus.OK, object, totalElements, totalPages, page, true);
    }

    public static ApiResponse ok(Object object, long totalElements, long totalPages, long page, boolean success) {
        return api(HttpStatus.OK, object, totalElements, totalPages, page, success);
    }

    public static ApiResponse ok(String message, Object object) {
        return api(message, HttpStatus.OK, object);
    }

    // Created 201
    public static ApiResponse created() {
        return api(HttpStatus.Created);
    }

    public static ApiResponse created(String message) {
        return api(message, HttpStatus.Created);
    }

    public static ApiResponse created(Object object) {
        return api(HttpStatus.Created, object);
    }

    public static ApiResponse created(String message, Object object) {
        return api(message, HttpStatus.Created, object);
    }

    // Accepted 202
    public static ApiResponse accepted() {
        return api(HttpStatus.Accepted);
    }

    public static ApiResponse accepted(String message) {
        return api(message, HttpStatus.Accepted);
    }

    public static ApiResponse accepted(Object object) {
        return api(HttpStatus.Accepted, object);
    }

    public static ApiResponse accepted(String message, Object object) {
        return api(message, HttpStatus.Accepted, object);
    }

    // NonAuthoritativeInformation 203
    public static ApiResponse nonAuthoritativeInformation() {
        return api(HttpStatus.NonAuthoritativeInformation);
    }

    public static ApiResponse nonAuthoritativeInformation(String message) {
        return api(message, HttpStatus.NonAuthoritativeInformation);
    }

    public static ApiResponse nonAuthoritativeInformation(Object object) {
        return api(HttpStatus.NonAuthoritativeInformation, object);
    }

    public static ApiResponse nonAuthoritativeInformation(String message, Object object) {
        return api(message, HttpStatus.NonAuthoritativeInformation, object);
    }

    // NoContent 204
    public static ApiResponse noContent() {
        return api(HttpStatus.NoContent);
    }

    public static ApiResponse noContent(String message) {
        return api(message, HttpStatus.NoContent);
    }

    public static ApiResponse noContent(Object object) {
        return api(HttpStatus.NoContent, object);
    }

    public static ApiResponse noContent(String message, Object object) {
        return api(message, HttpStatus.NoContent, object);
    }

    // ResetContent 205
    public static ApiResponse resetContent() {
        return api(HttpStatus.ResetContent);
    }

    public static ApiResponse resetContent(String message) {
        return api(message, HttpStatus.ResetContent);
    }

    public static ApiResponse resetContent(Object object) {
        return api(HttpStatus.ResetContent, object);
    }

    public static ApiResponse resetContent(String message, Object object) {
        return api(message, HttpStatus.ResetContent, object);
    }

    // PartialContent 206
    public static ApiResponse partialContent() {
        return api(HttpStatus.PartialContent);
    }

    public static ApiResponse partialContent(String message) {
        return api(message, HttpStatus.PartialContent);
    }

    public static ApiResponse partialContent(Object object) {
        return api(HttpStatus.PartialContent, object);
    }

    public static ApiResponse partialContent(String message, Object object) {
        return api(message, HttpStatus.PartialContent, object);
    }

    // PartialContent 300
    public static ApiResponse multipleChoices() {
        return api(HttpStatus.MultipleChoices);
    }

    public static ApiResponse multipleChoices(String message) {
        return api(message, HttpStatus.MultipleChoices);
    }

    public static ApiResponse multipleChoices(Object object) {
        return api(HttpStatus.MultipleChoices, object);
    }

    public static ApiResponse multipleChoices(String message, Object object) {
        return api(message, HttpStatus.MultipleChoices, object);
    }

    // MovedPermanently 301
    public static ApiResponse movedPermanently() {
        return api(HttpStatus.MovedPermanently);
    }

    public static ApiResponse movedPermanently(String message) {
        return api(message, HttpStatus.MovedPermanently);
    }

    public static ApiResponse movedPermanently(Object object) {
        return api(HttpStatus.MovedPermanently, object);
    }

    public static ApiResponse movedPermanently(String message, Object object) {
        return api(message, HttpStatus.MovedPermanently, object);
    }

    // Found 302
    public static ApiResponse found() {
        return api(HttpStatus.Found);
    }

    public static ApiResponse found(String message) {
        return api(message, HttpStatus.Found);
    }

    public static ApiResponse found(Object object) {
        return api(HttpStatus.Found, object);
    }

    public static ApiResponse found(String message, Object object) {
        return api(message, HttpStatus.Found, object);
    }

    // SeeOther 303
    public static ApiResponse seeOther() {
        return api(HttpStatus.SeeOther);
    }

    public static ApiResponse seeOther(String message) {
        return api(message, HttpStatus.SeeOther);
    }

    public static ApiResponse seeOther(Object object) {
        return api(HttpStatus.SeeOther, object);
    }

    public static ApiResponse seeOther(String message, Object object) {
        return api(message, HttpStatus.SeeOther, object);
    }

    // NotModified 304
    public static ApiResponse notModified() {
        return api(HttpStatus.NotModified);
    }

    public static ApiResponse notModified(String message) {
        return api(message, HttpStatus.NotModified);
    }

    public static ApiResponse notModified(Object object) {
        return api(HttpStatus.NotModified, object);
    }

    public static ApiResponse notModified(String message, Object object) {
        return api(message, HttpStatus.NotModified, object);
    }

    // UseProxy 305
    public static ApiResponse useProxy() {
        return api(HttpStatus.UseProxy);
    }

    public static ApiResponse useProxy(String message) {
        return api(message, HttpStatus.UseProxy);
    }

    public static ApiResponse useProxy(Object object) {
        return api(HttpStatus.UseProxy, object);
    }

    public static ApiResponse useProxy(String message, Object object) {
        return api(message, HttpStatus.UseProxy, object);
    }

    // UnUsed 306
    public static ApiResponse unUsed() {
        return api(HttpStatus.UnUsed);
    }

    public static ApiResponse unUsed(String message) {
        return api(message, HttpStatus.UnUsed);
    }

    public static ApiResponse unUsed(Object object) {
        return api(HttpStatus.UnUsed, object);
    }

    public static ApiResponse unUsed(String message, Object object) {
        return api(message, HttpStatus.UnUsed, object);
    }

    // TemporaryRedirect 307
    public static ApiResponse temporaryRedirect() {
        return api(HttpStatus.TemporaryRedirect);
    }

    public static ApiResponse temporaryRedirect(String message) {
        return api(message, HttpStatus.TemporaryRedirect);
    }

    public static ApiResponse temporaryRedirect(Object object) {
        return api(HttpStatus.TemporaryRedirect, object);
    }

    public static ApiResponse temporaryRedirect(String message, Object object) {
        return api(message, HttpStatus.TemporaryRedirect, object);
    }


    /**
     * Errors
     **/

    // BadRequest
    public static ApiResponse badRequest() {
        return api(HttpStatus.BadRequest);
    }

    public static ApiResponse badRequest(String message) {
        return api(message, HttpStatus.BadRequest);
    }

    public static ApiResponse badRequest(Object object) {
        return api(HttpStatus.BadRequest, object);
    }

    public static ApiResponse badRequest(String message, Object object) {
        return api(message, HttpStatus.BadRequest, object);
    }

    // Unauthorized
    public static ApiResponse unauthorized() {
        return api(HttpStatus.Unauthorized);
    }

    public static ApiResponse unauthorized(String message) {
        return api(message, HttpStatus.Unauthorized);
    }

    public static ApiResponse unauthorized(Object object) {
        return api(HttpStatus.Unauthorized, object);
    }

    public static ApiResponse unauthorized(String message, Object object) {
        return api(message, HttpStatus.Unauthorized, object);
    }

    // PaymentRequired
    public static ApiResponse paymentRequired() {
        return api(HttpStatus.PaymentRequired);
    }

    public static ApiResponse paymentRequired(String message) {
        return api(message, HttpStatus.PaymentRequired);
    }

    public static ApiResponse paymentRequired(Object object) {
        return api(HttpStatus.PaymentRequired, object);
    }

    public static ApiResponse paymentRequired(String message, Object object) {
        return api(message, HttpStatus.PaymentRequired, object);
    }

    // Forbidden
    public static ApiResponse forbidden() {
        return api(HttpStatus.Forbidden);
    }

    public static ApiResponse forbidden(String message) {
        return api(message, HttpStatus.Forbidden);
    }

    public static ApiResponse forbidden(Object object) {
        return api(HttpStatus.Forbidden, object);
    }

    public static ApiResponse forbidden(String message, Object object) {
        return api(message, HttpStatus.Forbidden, object);
    }

    // NotFound
    public static ApiResponse notFound() {
        return api(HttpStatus.NotFound);
    }

    public static ApiResponse notFound(String message) {
        return api(message, HttpStatus.NotFound);
    }

    public static ApiResponse notFound(Object object) {
        return api(HttpStatus.NotFound, object);
    }

    public static ApiResponse notFound(String message, Object object) {
        return api(message, HttpStatus.NotFound, object);
    }

    // MethodNotAllowed
    public static ApiResponse methodNotAllowed() {
        return api(HttpStatus.MethodNotAllowed);
    }

    public static ApiResponse methodNotAllowed(String message) {
        return api(message, HttpStatus.MethodNotAllowed);
    }

    public static ApiResponse methodNotAllowed(Object object) {
        return api(HttpStatus.MethodNotAllowed, object);
    }

    public static ApiResponse methodNotAllowed(String message, Object object) {
        return api(message, HttpStatus.MethodNotAllowed, object);
    }

    // NotAcceptable
    public static ApiResponse notAcceptable() {
        return api(HttpStatus.NotAcceptable);
    }

    public static ApiResponse notAcceptable(String message) {
        return api(message, HttpStatus.NotAcceptable);
    }

    public static ApiResponse notAcceptable(Object object) {
        return api(HttpStatus.NotAcceptable, object);
    }

    public static ApiResponse notAcceptable(String message, Object object) {
        return api(message, HttpStatus.NotAcceptable, object);
    }

    // ProxyAuthenticationRequired
    public static ApiResponse proxyAuthenticationRequired() {
        return api(HttpStatus.ProxyAuthenticationRequired);
    }

    public static ApiResponse proxyAuthenticationRequired(String message) {
        return api(message, HttpStatus.ProxyAuthenticationRequired);
    }

    public static ApiResponse proxyAuthenticationRequired(Object object) {
        return api(HttpStatus.ProxyAuthenticationRequired, object);
    }

    public static ApiResponse proxyAuthenticationRequired(String message, Object object) {
        return api(message, HttpStatus.ProxyAuthenticationRequired, object);
    }

    // RequestTimeout
    public static ApiResponse requestTimeout() {
        return api(HttpStatus.RequestTimeout);
    }

    public static ApiResponse requestTimeout(String message) {
        return api(message, HttpStatus.RequestTimeout);
    }

    public static ApiResponse requestTimeout(Object object) {
        return api(HttpStatus.RequestTimeout, object);
    }

    public static ApiResponse requestTimeout(String message, Object object) {
        return api(message, HttpStatus.RequestTimeout, object);
    }

    // Conflict
    public static ApiResponse conflict() {
        return api(HttpStatus.Conflict);
    }

    public static ApiResponse conflict(String message) {
        return api(message, HttpStatus.Conflict);
    }

    public static ApiResponse conflict(Object object) {
        return api(HttpStatus.Conflict, object);
    }

    public static ApiResponse conflict(String message, Object object) {
        return api(message, HttpStatus.Conflict, object);
    }

    // Gone
    public static ApiResponse gone() {
        return api(HttpStatus.Gone);
    }

    public static ApiResponse gone(String message) {
        return api(message, HttpStatus.Gone);
    }

    public static ApiResponse gone(Object object) {
        return api(HttpStatus.Gone, object);
    }

    public static ApiResponse gone(String message, Object object) {
        return api(message, HttpStatus.Gone, object);
    }

    // LengthRequired
    public static ApiResponse lengthRequired() {
        return api(HttpStatus.LengthRequired);
    }

    public static ApiResponse lengthRequired(String message) {
        return api(message, HttpStatus.LengthRequired);
    }

    public static ApiResponse lengthRequired(Object object) {
        return api(HttpStatus.LengthRequired, object);
    }

    public static ApiResponse lengthRequired(String message, Object object) {
        return api(message, HttpStatus.LengthRequired, object);
    }

    // PreconditionFailed
    public static ApiResponse preconditionFailed() {
        return api(HttpStatus.PreconditionFailed);
    }

    public static ApiResponse preconditionFailed(String message) {
        return api(message, HttpStatus.PreconditionFailed);
    }

    public static ApiResponse preconditionFailed(Object object) {
        return api(HttpStatus.PreconditionFailed, object);
    }

    public static ApiResponse preconditionFailed(String message, Object object) {
        return api(message, HttpStatus.PreconditionFailed, object);
    }

    // RequestEntityTooLarge
    public static ApiResponse requestEntityTooLarge() {
        return api(HttpStatus.RequestEntityTooLarge);
    }

    public static ApiResponse requestEntityTooLarge(String message) {
        return api(message, HttpStatus.RequestEntityTooLarge);
    }

    public static ApiResponse requestEntityTooLarge(Object object) {
        return api(HttpStatus.RequestEntityTooLarge, object);
    }

    public static ApiResponse requestEntityTooLarge(String message, Object object) {
        return api(message, HttpStatus.RequestEntityTooLarge, object);
    }

    // RequestedURITooLong
    public static ApiResponse requestedURITooLong() {
        return api(HttpStatus.RequestedURITooLong);
    }

    public static ApiResponse requestedURITooLong(String message) {
        return api(message, HttpStatus.RequestedURITooLong);
    }

    public static ApiResponse requestedURITooLong(Object object) {
        return api(HttpStatus.RequestedURITooLong, object);
    }

    public static ApiResponse requestedURITooLong(String message, Object object) {
        return api(message, HttpStatus.RequestedURITooLong, object);
    }

    // UnsupportedMediaType
    public static ApiResponse unsupportedMediaType() {
        return api(HttpStatus.UnsupportedMediaType);
    }

    public static ApiResponse unsupportedMediaType(String message) {
        return api(message, HttpStatus.UnsupportedMediaType);
    }

    public static ApiResponse unsupportedMediaType(Object object) {
        return api(HttpStatus.UnsupportedMediaType, object);
    }

    public static ApiResponse unsupportedMediaType(String message, Object object) {
        return api(message, HttpStatus.UnsupportedMediaType, object);
    }

    // RequestRangeNotSatisfiable
    public static ApiResponse requestRangeNotSatisfiable() {
        return api(HttpStatus.RequestRangeNotSatisfiable);
    }

    public static ApiResponse requestRangeNotSatisfiable(String message) {
        return api(message, HttpStatus.RequestRangeNotSatisfiable);
    }

    public static ApiResponse requestRangeNotSatisfiable(Object object) {
        return api(HttpStatus.RequestRangeNotSatisfiable, object);
    }

    public static ApiResponse requestRangeNotSatisfiable(String message, Object object) {
        return api(message, HttpStatus.RequestRangeNotSatisfiable, object);
    }

    // ExpectationFailed
    public static ApiResponse expectationFailed() {
        return api(HttpStatus.ExpectationFailed);
    }

    public static ApiResponse expectationFailed(String message) {
        return api(message, HttpStatus.ExpectationFailed);
    }

    public static ApiResponse expectationFailed(Object object) {
        return api(HttpStatus.ExpectationFailed, object);
    }

    public static ApiResponse expectationFailed(String message, Object object) {
        return api(message, HttpStatus.ExpectationFailed, object);
    }

    // ImATeapot
    public static ApiResponse imATeapot() {
        return api(HttpStatus.ImATeapot);
    }

    public static ApiResponse imATeapot(String message) {
        return api(message, HttpStatus.ImATeapot);
    }

    public static ApiResponse imATeapot(Object object) {
        return api(HttpStatus.ImATeapot, object);
    }

    public static ApiResponse imATeapot(String message, Object object) {
        return api(message, HttpStatus.ImATeapot, object);
    }


    // TooManyRequest
    public static ApiResponse tooManyRequest() {
        return api(HttpStatus.TooManyRequest);
    }

    public static ApiResponse tooManyRequest(String message) {
        return api(message, HttpStatus.TooManyRequest);
    }

    public static ApiResponse tooManyRequest(Object object) {
        return api(HttpStatus.TooManyRequest, object);
    }

    public static ApiResponse tooManyRequest(String message, Object object) {
        return api(message, HttpStatus.TooManyRequest, object);
    }

    // InternalServerError
    public static ApiResponse internalServerError() {
        return api(HttpStatus.InternalServerError);
    }

    public static ApiResponse internalServerError(String message) {
        return api(message, HttpStatus.InternalServerError);
    }

    public static ApiResponse internalServerError(Object object) {
        return api(HttpStatus.InternalServerError, object);
    }

    public static ApiResponse internalServerError(String message, Object object) {
        return api(message, HttpStatus.InternalServerError, object);
    }

    // NotImplemented
    public static ApiResponse notImplemented() {
        return api(HttpStatus.NotImplemented);
    }

    public static ApiResponse notImplemented(String message) {
        return api(message, HttpStatus.NotImplemented);
    }

    public static ApiResponse notImplemented(Object object) {
        return api(HttpStatus.NotImplemented, object);
    }

    public static ApiResponse notImplemented(String message, Object object) {
        return api(message, HttpStatus.NotImplemented, object);
    }

    // BadGateway
    public static ApiResponse badGateway() {
        return api(HttpStatus.BadGateway);
    }

    public static ApiResponse badGateway(String message) {
        return api(message, HttpStatus.BadGateway);
    }

    public static ApiResponse badGateway(Object object) {
        return api(HttpStatus.BadGateway, object);
    }

    public static ApiResponse badGateway(String message, Object object) {
        return api(message, HttpStatus.BadGateway, object);
    }

    // ServiceUnavailable
    public static ApiResponse serviceUnavailable() {
        return api(HttpStatus.ServiceUnavailable);
    }

    public static ApiResponse serviceUnavailable(String message) {
        return api(message, HttpStatus.ServiceUnavailable);
    }

    public static ApiResponse serviceUnavailable(Object object) {
        return api(HttpStatus.ServiceUnavailable, object);
    }

    public static ApiResponse serviceUnavailable(String message, Object object) {
        return api(message, HttpStatus.ServiceUnavailable, object);
    }

    // GatewayTimeout
    public static ApiResponse gatewayTimeout() {
        return api(HttpStatus.GatewayTimeout);
    }

    public static ApiResponse gatewayTimeout(String message) {
        return api(message, HttpStatus.GatewayTimeout);
    }

    public static ApiResponse gatewayTimeout(Object object) {
        return api(HttpStatus.GatewayTimeout, object);
    }

    public static ApiResponse gatewayTimeout(String message, Object object) {
        return api(message, HttpStatus.GatewayTimeout, object);
    }

    // HttpVersionNotSupported
    public static ApiResponse httpVersionNotSupported() {
        return api(HttpStatus.HttpVersionNotSupported);
    }

    public static ApiResponse httpVersionNotSupported(String message) {
        return api(message, HttpStatus.HttpVersionNotSupported);
    }

    public static ApiResponse httpVersionNotSupported(Object object) {
        return api(HttpStatus.HttpVersionNotSupported, object);
    }

    public static ApiResponse httpVersionNotSupported(String message, Object object) {
        return api(message, HttpStatus.HttpVersionNotSupported, object);
    }

    // Unknown
    public static ApiResponse unknown() {
        return api(HttpStatus.Unknown);
    }

    public static ApiResponse unknown(String message) {
        return api(message, HttpStatus.Unknown);
    }

    public static ApiResponse unknown(Object object) {
        return api(HttpStatus.Unknown, object);
    }

    public static ApiResponse unknown(String message, Object object) {
        return api(message, HttpStatus.Unknown, object);
    }

}



