package baitap.behavioural_patterns.command.challenge;

public class CancelOrderCommand implements Command {
	private Kitchen kitchen;
	private String item;

	public CancelOrderCommand(Kitchen kitchen, String item) {
		this.kitchen = kitchen;
		this.item = item;
	}

	@Override
	public void execute() {
		kitchen.cancelOrder(item);
	}
}