import AbstractService from "../../../../core/modules/abstract/services/AbstractService";
import GuestbookEntry from "../models/GuestbookEntry.model.ts";

const GuestbookService = new AbstractService<GuestbookEntry>("/call/bottles/");

export default GuestbookService;