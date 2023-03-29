package requestHandlers;

import com.amazon.ask.dispatcher.request.handler.HandlerAdapter;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.handler.adapter.impl.BaseHandlerAdapter;

import java.util.Optional;

/**
 * {@link HandlerAdapter} implementation for {@link RequestHandler} implementations.
 */
@Deprecated
public class DefaultHandlerAdapter extends BaseHandlerAdapter<HandlerInput, Optional<Response>, RequestHandler> implements HandlerAdapter {

    /**
     * Constructor to build an instance of {@link DefaultHandlerAdapter}.
     */
    public DefaultHandlerAdapter() {
        super(RequestHandler.class);
    }


}
